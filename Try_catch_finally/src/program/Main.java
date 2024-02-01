package program;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		File file = new File("C:\\teste\\teste.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}catch(FileNotFoundException e) {
			System.out.println("Error: file problably not found" + e.getMessage());
		}finally {
			if(sc != null) {
				sc.close();
			}
		}
	}

}
