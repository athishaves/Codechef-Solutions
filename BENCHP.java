import java.util.*;
import java.lang.*;
import java.io.*;


  class BENCHP {

	static FastReader sc;

	public static void main (String[] args) throws java.lang.Exception {
		sc = new FastReader();
		int t = 1;
		t = sc.nextInt();
		while (t-- > 0) func();
	}


	
	public static void func () {
		long n = sc.nextLong(), W = sc.nextLong(), w = sc.nextLong();
		HashMap<Long, Long> map = new HashMap<>();
		
		long t;
		while (n-- > 0) {
			t = sc.nextLong();
			if (map.containsKey(t)) map.put(t, map.get(t) + 1);
			else map.put(t, 1L);
		}
		
		System.out.println(f(map, n, W, w) ? "YES" : "NO");
	}
	
	static boolean f (HashMap<Long, Long> map, long n, long W, long w) {		
		long sum = 0;
		long c, k;
		
		for (long i : map.keySet()) {
			c = map.get(i);
			
			k = i*(c>>1);
			sum += (k<<1);
		}
		
		return sum + w >= W;
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
