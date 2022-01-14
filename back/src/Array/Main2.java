package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	
		int[] a = new int[9];
		
		int i = 0;
		while(i < 9) {
			a[i] = Integer.parseInt(br.readLine());
			 i++;
		}
		int c = 0;
		int max = 0;
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
