import java.util.*;
import java.lang.*;
import java.io.*;


  class ARRROT {

	static FastReader sc;

	public static void main (String[] args) throws java.lang.Exception {
		sc = new FastReader();
		int t = 1;
		//t = sc.nextInt();
		while (t-- > 0) func();
	}


	
	public static void func () {
		int n = sc.nextInt();
		long sum = 0;
		
		while (n-- > 0) sum += sc.nextLong();
		
		int q = sc.nextInt();
		
		while (q-- > 0) {
			sc.nextInt();
			
			sum *= 2;
			while (sum < 0) sum += MOD;
			sum %= MOD;
		
			System.out.println(sum);
		}
	}
	
	static long mod (long a) {
		return a>0 ? a%MOD : (a+MOD)%MOD;
	}
	
	
	static final long MOD = 1000000000 + 7;
	

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
