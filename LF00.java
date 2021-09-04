import java.util.*;
import java.lang.*;
import java.io.*;


class LF00 {

	static FastReader sc;

	public static void main (String[] args) throws java.lang.Exception {
		sc = new FastReader();
		int t = 1;
		t = sc.nextInt();
		while (t-- > 0) func();
	}


	
	public static void func () {
		int A = sc.nextInt(), n = sc.nextInt(), d = sc.nextInt();
		int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
		
		System.out.println(f(A,n,d,x,y,z) ? "YES" : "NO");
	}
	
	static boolean f (int a, int n, int d, int x, int y, int z) {
		if (days(a) > d) return false;
		if (x+y+z != n) return true;
		
		int m = -1;
		if (z != 0) m = 60;
		if (y != 0) m = 30;
		if (x != 0) m = 10;
		
		return days(m) + days(a) <= d;
	}
	
	static int days (int n) {
		if (n<=18) return 10;
		if (n<=50) return 14;
		return 21;
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
