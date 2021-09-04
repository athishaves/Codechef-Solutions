import java.util.*;
import java.lang.*;
import java.io.*;


class BOLT {

	static Scanner scanner;

	public static void main (String[] args) throws java.lang.Exception {
		scanner = new Scanner(System.in);
		int t = 1;
		t = scanner.nextInt();
		while (t-- > 0) func();
	}
	
	
	public static void func () {
		double k1 = scanner.nextDouble();
		double k2 = scanner.nextDouble();
		double k3 = scanner.nextDouble();
		double v = scanner.nextDouble();
		
		System.out.println( round((100 / (k1*k2*k3*v)), 2) < 9.58 ? "YES" : "NO" );
	}
	
	static double round (double a, int k) {
		double temp = Math.pow(10, k);
		return Math.round(a*temp) / temp;
	}

}
