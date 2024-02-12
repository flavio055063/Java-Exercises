package program;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		
		String path = "C:\\\\Users\\\\flavi\\\\OneDrive\\\\Desktop\\\\teste excluir\\\\testFile.txt";
		
		//MANEIRA MAIS MODERNA - BufferedReader com try-with-resources
		System.out.println("--- using BufferedReader try-with-resources ---");
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String aux = br.readLine();
			
			while (aux != null) {
				System.out.println(aux);
				aux = br.readLine();
			}
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
		
		// USO SIMPLES DE ARQUIVO
		System.out.println("--- using Scanner ancient way ---");
		File file = new File(path);
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}catch(IOException e) {
			System.out.println("Error: ");
			System.out.println(e);
		}finally {
			if(sc != null) {
				sc.close();
			}
		}
		
		// USO DE ARQUIVO COM BufferedReader (Usa um buffer interno para armazenar uma quantidade
		// significativa de dados em memória antes de serem lidos pelo programa. Isso reduz a frequência de acesso ao fluxo de entrada
		// melhorando o desempenho.)
		System.out.println("--- using BufferedReader ---");
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String aux = br.readLine();
			
			while (aux != null) {
				System.out.println(aux);
				aux = br.readLine();
			}
			
		}catch(IOException e){
			System.out.println(e.getMessage());
		}finally{
			try {
				if(fr != null) {
					fr.close();
				}
				if(br != null) {
					br.close();
				}
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
}
