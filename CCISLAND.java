import java.util.*;
import java.lang.*;
import java.io.*;


public class CCISLAND {

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
		int x = scanner.nextInt(), y = scanner.nextInt();
		int x1 = scanner.nextInt(), y1 = scanner.nextInt();
		int d = scanner.nextInt();
		
		System.out.println( (Math.min(x/x1, y/y1) >= d) ? "YES" : "NO");
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
