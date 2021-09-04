import java.util.*;
import java.lang.*;
import java.io.*;


class CM164364 {

	static FastReader sc;

	public static void main (String[] args) throws java.lang.Exception {
		sc = new FastReader();
		int t = 1;
		t = sc.nextInt();
		while (t-- > 0) func();
	}


	
	public static void func () {
		int n = sc.nextInt(), x = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();
		
		int t;
		for (int i=0; i<n; i++) {
			t = sc.nextInt();
			if (map.containsKey(t)) map.put(t, 1+map.get(t));
			else map.put(t, 1);
		}
		
		int res = 0;
		for (int i : map.keySet()) {
			res += map.get(i) - 1;
		}
		System.out.println(res >= x ? map.size() : map.size()-x+res);
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
