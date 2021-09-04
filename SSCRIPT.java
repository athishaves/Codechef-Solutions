import java.util.*;
import java.lang.*;
import java.io.*;


class SSCRIPT {

	static Scanner scanner;

	public static void main (String[] args) throws java.lang.Exception {
		scanner = new Scanner(System.in);
		int t = 1;
		t = scanner.nextInt();
		while (t-- > 0) func();
		scanner.close();
	}
	
	
	public static void func () {
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		String a = scanner.next();
		System.out.println(f(a,n,k) ? "YES" : "NO");
	}
	
	static boolean f (String a, int n, int k) {
		int res = 0;
		for (int i = 0; i < n; i++) {
			if (a.charAt(i) == '*') {
				res++;
				if (res >= k) return true;
			} else res = 0;
		}
		return false;
	}

}
