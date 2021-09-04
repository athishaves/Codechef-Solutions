import java.util.*;
import java.lang.*;
import java.io.*;


class RISK {

	static FastReader sc;

	public static void main (String[] args) throws java.lang.Exception {
		sc = new FastReader();
		int t = 1;
		t = sc.nextInt();
		while (t-- > 0) func();
	}


	
	public static void func () {
		int n = sc.nextInt(), m = sc.nextInt();
		char[][] a = new char[n][m];
		
		for (int i=0; i<n; i++) a[i] = sc.nextLine().toCharArray();
		
		ArrayList<Integer> res = new ArrayList<>();
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				if (a[i][j] == '1') res.add(f(a,i,j,n,m));
			}
		}
		
		Collections.sort(res, Collections.reverseOrder());
//		System.out.println("SIZE " + res.size());
		
		int val = 0;
		for (int i=1; i<res.size(); i+=2) val += res.get(i);
		System.out.println(val);
	}
	
	static int f (char[][] a, int i, int j, int n, int m) {
		if (i < 0 || j < 0 || i >= n || j >= m || a[i][j] != '1') return 0;
		a[i][j] = '0';
		return 1 + f(a,i-1,j,n,m) + f(a,i,j-1,n,m) + f(a,i+1,j,n,m) + f(a,i,j+1,n,m);
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
