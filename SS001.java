import java.util.*;
import java.lang.*;
import java.io.*;


class SS001 {

	static FastReader sc;

	public static void main (String[] args) throws java.lang.Exception {
		sc = new FastReader();
		int t = 1;
		t = sc.nextInt();
		while (t-- > 0) func();
	}


	
	public static void func () {
		long r = sc.nextLong();	int n = sc.nextInt(), t = sc.nextInt();
		
		long[] a = new long[n];
		for (int i=0; i<n; i++) a[i] = sc.nextLong();
		
		Arrays.sort(a);
		
		long val = 0;	n--;
		while (n >= 0 && t > 1) {
			val += a[n--];
			t -= 2;
		}
		
		if (n >= 0 && t == 1) val += Math.ceil(a[n]/2);
		
		System.out.println(val > r ? "YES" : "NO");
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
