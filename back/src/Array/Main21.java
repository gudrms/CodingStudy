package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main21 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		st = new StringTokenizer(br.readLine(), " ");
		int[] a = new int[9];
		
		for(int i=0;i<9;i++) {
			a[i] = Integer.parseInt(st.nextToken());
			
		}
		
		int max = 0;
		int c = 0;
		int index = 0;
		
		for(int v : a) {
			c++;
			if(v > max) {
				max = v;
				index = c;
			}
		}
		System.out.println(max);
		System.out.println(index);
	}

}
