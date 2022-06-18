package Test;

public class Calculator {
	public static int add(int a , int b) {
		return a+b;
	}
	public static int sub(int a , int b) {
		return a-b;
	}
	public static int mul(int a , int b) {
		return a*b;
	}
	public static double divi(double a , double b) {
		if(b==0) {
			throw new IllegalArgumentException("Not divided by zero 0!");
		}
		return a/b;
	}
}
