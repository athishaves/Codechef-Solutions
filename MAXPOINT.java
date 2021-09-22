import java.util.*;
import java.lang.*;
import java.io.*;


  class MAXPOINT {

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
		int n = 3;
		
		Integer[] a = new Integer[n];
		Integer[] b = new Integer[n];
		
		read(a);	read(b);
		
		int result = 0;
		
		for (int i=0; i<=20; i++) {
			int time0 = i * a[0];
			int res0 = i * b[0];
			
			if (time0 > 240) break;
			result = max(result, res0);
			
			for (int j=0; j<=20; j++) {
				int time1 = time0 + j * a[1];
				int res1 = res0 + j * b[1];
				
				if (time1 > 240) break;
				result = max(result, res1);
			
				for (int k=0; k<=20; k++) {
					int time2 = time1 + k * a[2];
					int res2 = res1 + k * b[2];
				
					if (time2 > 240) break;
					result = max(result, res2);
				}
			}
		}
		
		println(result);
	}

	
	public static void funca () {
		int n = 3;
		
	    Obj[] a = new Obj[n];
	    Long[] temp = new Long[n];
	    
	    read(temp);
	    
	    for (int i=0; i<3; i++)
	    	a[i] = new Obj(sc.nLong(), temp[i]);
	    
	    Arrays.sort(a, (b,c) -> compare(c.avg, b.avg));
	    
	    ptarray(a);
	    
	    long res = 0;
	    long time = 0;
	    
	    
	    for (int i=0; i<3; i++) {
		    long diff = 240 - time;
	    	long count = min(diff / a[i].time, 20L);
	    	
	    	time += count * a[i].time;
		    res += count * a[i].val;
		    
		    println(time + " " + res);
	    }
	    
	    println(res);
	}
	
	static class Comp implements Comparator<Obj> {
	
		public int compare (Obj a, Obj b) {
			int res = Double.compare(a.avg, b.avg);
			if (res == 0) return Long.compare(a.time, b.time);
			return res;
		}
		
	}
	
	static class Obj {
		long val, time;
		double avg;
		Obj (Long a, Long b) {
			val = a;
			time = b;
			avg = (double)val / time;
		}
		public String toString() {
			return val + " " + time + " " + avg + "\n";
		}
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
