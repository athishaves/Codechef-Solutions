import java.util.*;
import java.lang.*;
import java.io.*;


public class HIRETEST {

	static FastReader scanner;

	public static void main (String[] args) throws java.lang.Exception {
		scanner = new FastReader();
		int t = 1;
		t = scanner.nextInt();
		while (t-- > 0) func();
	}


	
	public static void func () {
		int n = scanner.nextInt(), m = scanner.nextInt();
		int x = scanner.nextInt(), y = scanner.nextInt();
		while (n-- > 0)
			System.out.print(f(scanner.nextLine(), m, x, y) ? 1 : 0);
		System.out.println();
	}
	
	static boolean f (String a, int n, int x, int y) {
		int c=0, p=0;
		for (int i=0; i<n; i++) {
			if (a.charAt(i) == 'F') c++;
			else if (a.charAt(i) == 'P') p++;
		}
		return (c >= x) || (c == x-1 && p >= y);
	}
	
	

	static final String abc = "abcdefghijklmnopqrstuvwxyz";
	static final String ABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	
	
	
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;
	 
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
	 
		String next() {
			while (st == null || !st.hasMoreElements()) {
				try { st = new StringTokenizer(br.readLine()); }
				catch (IOException e) { e.printStackTrace(); }
			}
			return st.nextToken();
		}
	 
		int nextInt() { return Integer.parseInt(next()); }
	 
		long nextLong() { return Long.parseLong(next()); }
	 
		double nextDouble() { return Double.parseDouble(next()); }
	 
		String nextLine() {
			String str = "";
			try { str = br.readLine(); }
			catch (IOException e) { e.printStackTrace(); }
			return str;
		}
	}

}
