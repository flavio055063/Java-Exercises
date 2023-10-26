package util;

public class Calculator {
	public static final double PI = 3.1415;
	
	public static double circunference(double radius) {
		return (2* radius * PI);
	}
	
	public static double esphereVolume(double radius) {
		return (radius*radius*radius*(4/3)*PI);
	}
}
