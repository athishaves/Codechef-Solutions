import java.util.*;
import java.lang.*;
import java.io.*;


public class RCODE05 {

	static FastReader scanner;

	public static void main (String[] args) throws java.lang.Exception {
		scanner = new FastReader();
		int t = 1;
		t = scanner.nextInt();
		while (t-- > 0) func();
	}
	
	static final String abc = "abcdefghijklmnopqrstuvwxyz";
	
	public static void func () {
		int n = scanner.nextInt(),	k = scanner.nextInt();
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<k; j++)
				print(abc.charAt((i+j)%26) + " ");
			print("\n");
		}
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
