import java.util.*;
import java.lang.*;
import java.io.*;


public class RCODE04 {

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
		int c = 0, t = n;
		while (t != 0) {
			c++;
			t >>= 1;
		}
		for (int i=1; i<=n; i++) f(i,c);
	}
	
	static void f (int n, int c) {
		String a = "";
		while (c-- > 0) {
			a = ((n&1)==1 ? "*" : "#") + a;
			n >>= 1;
		}
		System.out.println(a);
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
