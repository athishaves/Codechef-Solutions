import java.util.*;
import java.lang.*;
import java.io.*;


  class REMONE {

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
	    int n = sc.nInt();
	    long[] a = new long[n];
	    long[] b = new long[n-1];
	    
	    for (int i=0; i<n; i++) a[i] = sc.nLong();
	    for (int i=0; i<n-1; i++) b[i] = sc.nLong();
	    
	    Arrays.sort(a);
	    Arrays.sort(b);
	    
	    println(func(a,b,n));
	}
	
	static long func (long[] a, long[] b, int n) {
	
	    long lastDiff = b[n-2] - a[n-1];
	    
	    if (lastDiff > 0) {
	        if (n == 2) return lastDiff;
	        
	        long diff1 = b[n-3] - a[n-2];
	        long diff2 = b[0] - a[0];
	        
	        if (lastDiff == diff1) return lastDiff;
	        if (lastDiff == diff2) return lastDiff;
	        
	        return diff2;
	        
	    } else return b[n-2] - a[n-2];
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
