import java.util.*;
import java.lang.*;
import java.io.*;


class BE001 {

	static FastReader sc;

	public static void main (String[] args) throws java.lang.Exception {
		cal();
		sc = new FastReader();
		int t = 1;
		t = sc.nextInt();
		while (t-- > 0) func();
	}

	
	static int size = 101;
	static int[][] dp = new int[size+1][size+1];
	
	static void cal () {
		for (int i=0; i<=size; i++) dp[0][i] = 1;
		for (int i=1; i<=size; i++) {
			for (int j=i; j<=size; j++) {
				if (j == 0 || j == i) dp[i][j] = 1;
				else dp[i][j] = dp[i-1][j-1] + dp[i][j-1];
			}
		}
		//printMatrix(dp);
	}
	
	static void printMatrix (int[][] a) {
		for (int[] i : a) printArray(i);
	}
	
	static void printArray (int[] a) {
		for (int i : a) System.out.print(i + " ");
		System.out.println();
	}
	
	public static void func () {
		int n = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
		System.out.println(dp[x][n] * dp[y][n]);
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
