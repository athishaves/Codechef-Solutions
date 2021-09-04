import java.util.*;
import java.lang.*;
import java.io.*;


class CHILLS {

	static FastReader sc;

	public static void main (String[] args) throws java.lang.Exception {
		sc = new FastReader();
		int t = 1;
		t = sc.nextInt();
		while (t-- > 0) func();
	}


	
	public static void func () {
		int n = sc.nextInt(), k = sc.nextInt();
		
		long[] a = new long[n];
		for (int i=0; i<n; i++) a[i] = sc.nextLong();
		
		long mid = a[n>>1], house = k>>1;
		long left = mid - (k>>1);
		long right = left + k - 1;
		
		long sum = 0;
		for (long i : a) sum += Math.max(absDiff(i,left), absDiff(i,right));
		System.out.println(sum);
	}
	
	static long absDiff (long a, long b) {
		return a>b ? a-b : b-a;
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
