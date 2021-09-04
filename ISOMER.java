import java.util.*;
import java.lang.*;
import java.io.*;


  class ISOMER {

	static FastReader sc;

	public static void main (String[] args) throws java.lang.Exception {
		sc = new FastReader();
		int t = 1;
		t = sc.nInt();
		while (t-- > 0) func();
	}


	static long[] a = new long[]{0,1,1,1,2,3,5,9,18,35,75,159,355,802,1858,4347,10359,24894,60523,148284,366319};
	
	public static void func () {
		println(a[sc.nInt()]);
	}
	
	static long r (int n) {
		
		switch(n) {
			case 0: return 0;
			case 1: return 1;
			case 2: return 1;
			case 3: return 1;
			case 4: return 2;
			case 5: return 3;
			case 6: return 5;
			case 7: return 9;
			case 8: return 18;
			case 9: return 35;
			case 10: return 75;
			case 11: return 159;
			case 12: return 355;
			case 13: return 802;
			case 14: return 1858;
			case 15: return 4347;
			case 16: return 10359;
			case 17: return 24894;
			case 18: return 60523;
			case 19: return 148284;
			case 20: return 366319;
		}
		return -1;
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
