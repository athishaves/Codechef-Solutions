import java.util.*;
import java.lang.*;
import java.io.*;


  class DIVCLASS {

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
		while (t-- > 0) 
			println(func() ? "yes" : "no");
		
		if (writer != null) writer.close();
	}

	
	public static boolean func () {
	    int n = sc.nInt();
	    HashSet<Integer> set = new HashSet<>();
	    for (int i=0; i<n; i++) set.add(sc.nInt());
	    
	    if (n < 12) return false;
	    if (set.size() > 12) return false;
	    return true;
	}
	
	
	static void read (Integer[] a, int start, int end) { for (int i=start; i!=end; i++) a[i] = sc.nInt(); }
	static void read (Integer[] a) { read(a, 0, a.length); }
	
	static void read (Long[] a, int start, int end) { for (int i=start; i!=end; i++) a[i] = sc.nLong(); }
	static void read (Long[] a) { read(a, 0, a.length); }
	
	static void read (Character[] a, int start, int end) { for (int i=start; i!=end; i++) a[i] = sc.next().charAt(0); }
	static void read (Character[] a) { read(a, 0, a.length); }
	
	static <T> void freq (Map<T, Long> map, T[] a) { for (T i : a) map.put( i, map.getOrDefault(i,0L) + 1L ); }
	
	
	static void print (int a, String t) throws Exception { writer.write(t); }
	static void println (int a, String t) throws Exception { writer.write(t + "\n"); }
	
	static <T> void print (T t) { System.out.print(t); }
	static <T> void println (T t) { System.out.println(t); }
	static void println () { System.out.println(); }
	
	static <U,V> void ptmap (Map<U,V> map) {
	    for (Map.Entry<U,V> e : map.entrySet()) {
	        println(e.getKey() + " " + e.getValue());
	    }
	}
	
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
	 
		public FastReader() { br = new BufferedReader(new InputStreamReader(System.in)); }
		
		public FastReader(String filePath) throws java.lang.Exception { br = new BufferedReader(new FileReader(filePath)); }
	 
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
