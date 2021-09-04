import java.util.*;
import java.lang.*;
import java.io.*;


public class RCODE02 {

	static FastReader scanner;

	public static void main (String[] args) throws java.lang.Exception {
		scanner = new FastReader();
		int t = 1;
		t = scanner.nextInt();
		while (t-- > 0) func();
	}

	
	
	static String abc = "abcdefghijklmnopqrstuvwxyz";		
	
	public static void func () {
		int n = scanner.nextInt(), k = scanner.nextInt();
		String a = abc.substring(0,n);
		
		StringBuilder sbr = new StringBuilder();
		
		int t = (int) (k/n);
		while (t-- > 0) {
			for (int i=0; i<n; i++) {
				sbr.append(a.substring(i,n));
				sbr.append(a.substring(0,i));
				sbr.append("\n");
			}
		}
		
		k %= n;
		for (int i=0; i<k; i++) {
			sbr.append(a.substring(i,n));
			sbr.append(a.substring(0,i));
			sbr.append("\n");
		}
		
		System.out.print(sbr.toString());
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
