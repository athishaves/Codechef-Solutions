import java.util.*;
import java.lang.*;
import java.io.*;


  class ETUP {

	static FastReader sc;
	static FileWriter writer = null;  

	public static void main (String[] args) throws java.lang.Exception {
		sc = new FastReader();
		
		boolean file_out = false;
		
		if (file_out) {
			File file = new File("/home/athish/Desktop/imp/imp1_out.txt");
			file.createNewFile();
			writer = new FileWriter(file);
		}
		
		int t = 1;
		t = sc.nInt();
		while (t-- > 0) func();
		
		if (writer != null) writer.close();
	}


	
	public static void func () {
		int n = sc.nInt(), q = sc.nInt();
		int[] a = new int[n+1];
		for (int i=1; i<=n; i++) {
			a[i] = a[i-1] + (sc.nInt() & 1);
		}
		
		while (q-- > 0) {
			long res = 0L;
			int x = sc.nInt(), y = sc.nInt();
			
			int odd = a[y] - a[x-1], even = y - x + 1 - odd;
			
			//println("--------");
			//println(odd + " " + even);
			
			res += comb(odd, 2) * comb(even, 1);
			
			//println(res);
			
			res += comb(even, 3);
			
			println(res);
		}
	}
	
	static long comb (int n, int r) {
		if (n < r) return 0;
		
		long res = 1L;
		
		for (long i=1; i<=r; i++)
			res = res * (n-i+1) / i;
		
		return res;
	}
	
	static void print (int a, String t) throws Exception { writer.write(t); }
	static void println (int a, String t) throws Exception { writer.write(t + "\n"); }
	
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
		
		public FastReader(String filePath) throws java.lang.Exception {
			br = new BufferedReader(new FileReader(filePath));
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
