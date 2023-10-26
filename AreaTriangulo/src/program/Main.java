package program;
import java.util.Scanner;
import entities.Triangulo;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Triangulo t1;
		t1 = new Triangulo();
		System.out.println("Insira os valores do triangulo: ");
		t1.lado1 = sc.nextDouble();
		t1.lado2 = sc.nextDouble();
		t1.lado3 = sc.nextDouble();
		
		System.out.println(t1.area());
		sc.close();
	}
}
