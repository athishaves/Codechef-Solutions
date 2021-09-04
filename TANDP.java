import java.util.*;
import java.lang.*;
import java.io.*;


class TANDP {

	static FastReader sc;

	public static void main (String[] args) throws java.lang.Exception {
		sc = new FastReader();
		int t = 1;
		t = sc.nextInt();
		while (t-- > 0) func();
	}


	
	public static void func () {
		int n = sc.nextInt(), m = sc.nextInt();
		System.out.println(
			theif(sc.nextInt(), sc.nextInt(), n, m) 
				> 
			police(sc.nextInt(), sc.nextInt(), n, m)
			? "NO" : "YES"
		);
	}
	
	static int police (int x, int y, int n, int m) {
		int t = Math.min(n-x, m-y);
		return t + theif(x+t, y+t, n, m);
	}
	
	static int theif (int x, int y, int n, int m) {
		return n-x + m-y;
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
