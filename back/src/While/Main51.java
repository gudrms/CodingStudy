package While;
//수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main51 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		int[] a = new int[10];
		int c = 0;
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int n =0; n<a.length;n++) {
			a[n] = Integer.parseInt(st.nextToken()) % 42 ;
		}
		System.out.println(a);
		for(int i =0; i<a.length;i++) {
			
			for(int j = i+1;j<a.length;j++) {
				if(a[i] == a[j]) {
					c++;
					break;
				}
			}
		}
		System.out.println(c);
		
	}
}
