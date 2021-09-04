import java.util.*;
import java.lang.*;
import java.io.*;


public class RCODE03 {

	static FastReader scanner;

	public static void main (String[] args) throws java.lang.Exception {
		scanner = new FastReader();
		int t = 1;
		t = scanner.nextInt();
		while (t-- > 0) func();
	}
	
	
	public static void func () {
		int n = scanner.nextInt();
		
		for (int i=0; i<=(n>>1); i++) {
			for (int j=0; j<n; j++) {				
				if (j==n-i-1) { print("*"); break; }
				else if (j==i) print("*");
				else print(" ");
			}
			System.out.println();
		}
		
		for (int i=(n>>1)-1; i>=0; i--) {
			for (int j=0; j<n; j++) {
				if (j==n-i-1) { print("*"); break; }
				else if (j==i) print("*");
				else print(" ");
			}
			System.out.println();
		}
		
	}
	
	static void print (String a) {
		System.out.print(a);
	}
	
	
	
	
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
