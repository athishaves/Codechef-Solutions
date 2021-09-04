import java.util.*;
import java.lang.*;
import java.io.*;


class SDICE {

	static Scanner scanner;

	public static void main (String[] args) throws java.lang.Exception {
		scanner = new Scanner(System.in);
		int t = 1;
		t = scanner.nextInt();
		while (t-- > 0) func();
	}
	
	
	public static void func () {
		long n = scanner.nextLong();
		System.out.println(f(n));
	}
	
	static long[] a = new long[]{20,36,51};
	
	static long f(long n) {
		if (n < 4) {
			return a[(int)n-1];
		}
		
		long res = (n-4)*11;
		
		if (n%4 == 0) 		res += 60;
		else if (n%4 == 1) 	res += 65;
		else 				res += 66;
		
		return res;
	}

}
