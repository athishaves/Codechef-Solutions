import java.util.*;
import java.lang.*;
import java.io.*;


class VCOUPLE {

	static FastReader sc;

	public static void main (String[] args) throws java.lang.Exception {
		sc = new FastReader();
		int t = 1;
		t = sc.nextInt();
		while (t-- > 0) func();
	}


	
	public static void func () {
		int n = sc.nextInt();
		long[] a = new long[n];
		for (int i=0; i<n; i++) a[i] = sc.nextLong();
		long[] b = new long[n];
		for (int i=0; i<n; i++) b[i] = sc.nextLong();
		
		Arrays.sort(a);	
		Arrays.sort(b);
		
		long res = Long.MIN_VALUE;
		for (int i=0; i<n; i++) res = Math.max(a[i]+b[n-1-i],res);
		System.out.println(res);
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
