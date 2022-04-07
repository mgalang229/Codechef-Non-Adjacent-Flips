import java.io.*;
import java.util.*;

public class Main {
	
	private static FastReader in;
	
	public static void main(String[] args) {
		in = new FastReader();
		int tc = 1;
		tc = in.nextInt();
		for(int t = 0; t < tc; t++) {
			new Solver();
		}
	}
	
	static class Solver { 
		Solver() {
			
			// input
			int n = in.nextInt();
			String s = in.next();
			
			// best case
			String z = "";
			for(int i = 0; i < n; i++) {
				z += "0";
			}

			// no need to do any operations
			if(s.equals(z)) {
				System.out.println(0);
				return;
			}

			// if there is at least one group of 1s that are adjacent to each other,
			// then the minimum number of operations will be 2, otherwise 1
			boolean adjacent = false;
			for(int i = 0; i + 1 < n; i++) {
				adjacent |= (s.charAt(i) == s.charAt(i + 1) && s.charAt(i) == '1');
			}

			// output
			System.out.println(!adjacent ? 1 : 2);
		}
	}
	
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;
		
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		String next() {
			while(st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		
		long nextLong() {
			return Long.parseLong(next());
		}
		
		double nextDouble() {
			return Double.parseDouble(next());
		}
		
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch(IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}
