import java.util.*;
import java.lang.*;
import java.io.*;


public class RCODE06 {

	static FastReader scanner;

	public static void main (String[] args) throws java.lang.Exception {
		scanner = new FastReader();
		int t = 1;
		t = scanner.nextInt();
		while (t-- > 0) func();
	}

	static final String abc = "abcdefghijklmnopqrstuvwxyz";
	static final String ABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	
	public static void func () {
		int n = scanner.nextInt();
		int[] a = new int[n];
		
		for (int i=1; i<=n; i++) { a[i-1] = i; print(i + " "); }
		print("\n");
		
		for (int j=0; j<(n>>1); j++) {
			swap(a, j, n-1-j);
			for (int i : a) print(i + " ");
			print("\n");
		}
	}
	
	static void swap (int[] a, int i, int j) {
		int temp;
		temp = a[i];	a[i] = a[j];	a[j] = temp;
	}
	
	static void print (String a) { System.out.print(a); }
	
	
	
	
	static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
 
        long nextLong() { return Long.parseLong(next()); }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

}
