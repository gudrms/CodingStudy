package While;
//ox퀴즈 ,  문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수

import java.io.IOException;
import java.util.Scanner;

public class Main71 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		String[] a = new String[sc.nextInt()];
		
		for(int i = 0; i< a.length; i++) {
			a[i]= sc.next();
		}
		sc.close();
		
		
		for(int i = 0; i < a.length; i++) {
			
			int c = 0;
			int s = 0;

			for(int j = 0 ; j<a[i].length(); j++) {
			
				if( a[i].charAt(j) =='O') {
					c++;	
				}
				else {
					c = 0;
				}
				s+=c;
			}
			
			System.out.println(s);
		}	
	}
}
//kkk//