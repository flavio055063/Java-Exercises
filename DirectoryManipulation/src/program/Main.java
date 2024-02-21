package program;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Stream;

import entities.SoldItem;

public class Main {

	public static void main(String[] args) {
		
		//obtendo do usuario o caminho do arquivo
		Locale.setDefault(Locale.US);
		System.out.println("Insira o caminho do arquivo .csv:");
		Scanner sc = new Scanner(System.in);
		String path = sc.nextLine();
		sc.close();
		
		//creating object list of sold items 
		ArrayList<SoldItem> sold = new ArrayList<SoldItem>();;
		
		//reading .csv file
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			Stream<String> streamData = br.lines();
			
			//lambda function to read all input
			streamData.forEach(item -> {
			    try {
			        analyzeCsvLine(sold, item);
			    } catch (ParseException e) {
			        e.printStackTrace();
			    }
			});
			
			for(SoldItem item : sold) {
				System.out.println(item);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//getting folder, adding out folder and making output
		File file = new File(path);
		String folder = file.getParent();
		String newFolder = folder + File.separator + "out";
		boolean success = new File(newFolder).mkdir();
		
		//adding info to out.csv file
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(newFolder+File.separator+"summary.csv"))){
			for(SoldItem item : sold) {
				bw.write(item.toString() + ",");
				bw.newLine();
			}
		}catch(IOException e) {
			System.out.print(e.getStackTrace());
		}
		
	
		
	}
	
	
	
	
	private static void analyzeCsvLine(ArrayList<SoldItem> sold, String item) throws ParseException{
		String[] parts = item.split(",");
		if (parts.length == 3) { // Certifique-se de que há três partes: nome, quantidade, preço
            String name = parts[0].trim();
            Double price = Double.parseDouble(parts[1].trim());
            Integer quantity = Integer.parseInt(parts[2].trim());

            sold.add(new SoldItem(name, price, quantity));
        } else {
            System.err.println("Linha CSV inválida: " + item);
        }
	}
}
