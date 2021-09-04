import java.util.*;
import java.lang.*;
import java.io.*;


  class XOREQUAL {

	static FastReader sc;

	public static void main (String[] args) throws java.lang.Exception {
		sc = new FastReader();
		int t = 1;
		t = sc.nInt();
		while (t-- > 0) func();
	}

	static void fen () {
		boolean flag = true;
		
		for (long i=0; i<10000000000L; i++) {
			if (i%100000000 == 0) println(i);
			
			boolean temp = ((i^(i+1)) == ((i+2)^(i+3)));
			
			if (((i&1) == 1 && temp) || ((i&1) == 0 && !temp))
				{ println(i); flag = false; }
		}
		
		println(flag);
	}

	
	public static void func () { println(f(2L, sc.nLong()-1)); }
	
	
	static long f (long a, long b) {
		String y = String.valueOf(b);
		
		long rem = 0;
		
		for (int i=0; i<y.length(); i++)
			rem = (rem*10 + y.charAt(i) - '0') % (MODLONG - 1);
			
		return power(a, rem, MODLONG);
	}
	
	
	static long power (long x, long y, long p) {
		long res = 1;
		
		x %= p;
		
		while (y > 0) {
			if ((y&1) == 1)
				res = (res * x) % p;
				
			y >>= 1;
			x = (x*x) % p;
		}
		
		return res;
	}
	
	
	
	static <T> void print (T t) { System.out.print(t); }
	static <T> void println (T t) { System.out.println(t); }
	static void println () { System.out.println(); }
	
	static <T> void ptarray (T[] t) { for(T i : t) print(i + " "); println(); }
	static <T> void ptmatrix (T[][] t) { for(T[] i : t) ptarray(i); }
	
	
	static <T extends Comparable<T>> int compare (T a, T b) { return a.compareTo(b); }
	
	static <T extends Comparable<T>> T min (T a, T b) { return compare(a,b) < 0 ? a : b; }
	static <T extends Comparable<T>> T max (T a, T b) { return compare(a,b) > 0 ? a : b; }
	
	static <T extends Comparable<T>> T min (T a, T b, T c) { return min(a,min(b,c)); }
	static <T extends Comparable<T>> T max (T a, T b, T c) { return max(a,max(b,c)); }
	
	

	static final String abc = "abcdefghijklmnopqrstuvwxyz";
	static final String ABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	static final int MODINT = 1000000000 + 7;
	static final long MODLONG = 1000000000 + 7;
	
	
	
	
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
	 
		int nInt() { return Integer.parseInt(next()); }
	 
		long nLong() { return Long.parseLong(next()); }
	 
		double nDouble() { return Double.parseDouble(next()); }
	 
		String nLine() {
			String str = "";
			try { str = br.readLine(); }
			catch (IOException e) { e.printStackTrace(); }
			return str;
		}
	}

}
