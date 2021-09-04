import java.util.*;
import java.lang.*;
import java.io.*;


  class TCTCTOE {

	static FastReader sc;

	public static void main (String[] args) throws java.lang.Exception {
		sc = new FastReader();
		int t = 1;
		t = sc.nInt();
		while (t-- > 0) func();
	}


	
	public static void func () {
		char[][] a = new char[3][3];
		for (int i=0; i<3; i++) a[i] = sc.nLine().toCharArray();
	
		println(fen(a));
	}
	
	
	static int fen (char[][] a) {
		int x = f(a,'X');
		int y = f(a,'O');
		
		int under = 0, ex = 0, o = 0;
		
		for (int i=0; i<3; i++)
			for (int j=0; j<3; j++) {
				if (a[i][j] == '_') under++;
				else if (a[i][j] == 'X') ex++;
				else o++;
			}
					
		
		if (!(ex == o || ex == o+1)) return 3;
		if (x > 1 || y > 1) return 3;
		if (x == 1 && y == 1) return 3;
		
		if (x == 1 || y == 1 || under == 0) return 1;
		
		 return 2;
	}
	
	
	static int f (char[][] a, char x) {
		int count = 0;
		
		for (int i=0; i<3; i++)
			if (a[i][0] == x && a[i][1] == x && a[i][2] == x) 
				count++;
				
		for (int i=0; i<3; i++)
			if (a[0][i] == x && a[1][i] == x && a[2][i] == x) 
				count++;
				
		if (a[0][0] == x && a[1][1] == x && a[2][2] == x) count++;
		
		if (a[0][2] == x && a[1][1] == x && a[2][0] == x) count++;
		
		return count;
	}
	
	
	static <T> void print (T t) { System.out.print(t); }
	static <T> void println (T t) { System.out.println(t); }
	static void println () { System.out.println(); }
	
	static void ptarray (char[] t) { for(char i : t) print(i + " "); println(); }
	static void ptmatrix (char[][] t) { for(char[] i : t) ptarray(i); }
	
	
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
