import java.util.*;
import java.lang.*;
import java.io.*;


class OROFAND {

	static FastReader sc;

	public static void main (String[] args) throws java.lang.Exception {
		sc = new FastReader();
		int t = 1;
		t = sc.nextInt();
		while (t-- > 0) func();
	}


	
	public static void func () {
		int n = sc.nextInt(), q = sc.nextInt();
		int[] res = new int[36];
		for (int i=0; i<n-1; i++) add(res, sc.nextInt());
		System.out.println(add(res, sc.nextInt()));
		
		while (q-- > 0)
			System.out.println(sub(res, sc.nextInt(), sc.nextInt()));
	}
	
	static int sub (int[] res, int a, int b) {
		int i=0, pow=1, r=0;
		while (i <= 32 || a != 0 || b != 0) {
			res[i] += (b&1) - (a&1);
			a >>= 1;	b >>= 1;
			r += (pow*(res[i++]==0 ? 0 : 1));
			pow <<= 1;
		}
		return r;
	}
	
	static int add (int[] res, int a) {
		int i=0, pow=1, r=0;
		while (i <= 32 || a != 0) {
			res[i] += (a&1);
			a >>= 1;
			r += (pow*(res[i++]==0 ? 0 : 1));
			pow <<= 1;
		}
		return r;
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
