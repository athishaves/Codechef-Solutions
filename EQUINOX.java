import java.util.*;
import java.lang.*;
import java.io.*;


  class EQUINOX {

	static FastReader sc;

	public static void main (String[] args) throws java.lang.Exception {
		String a = "EQUINOX";
		for (int i=0; i<a.length(); i++) set.add(a.charAt(i));
	
		sc = new FastReader();
		int t = 1;
		t = sc.nextInt();
		while (t-- > 0) func();
	}

	static HashSet<Character> set = new HashSet<>();
	
	public static void func () {
		long n = sc.nextLong(), a = sc.nextLong(), b = sc.nextLong();
		long sar = 0, anu = 0;
		
		while (n-- > 0) {
			if (set.contains(sc.nextLine().charAt(0))) sar += a;
			else anu += b;
		}
		
		System.out.println(sar==anu ? "DRAW" : (sar > anu ? "SARTHAK" : "ANURADHA"));
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
