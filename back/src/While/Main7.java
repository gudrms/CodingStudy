package While;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// ox퀴즈 ,  문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수
public class Main7 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		String[] a= new String[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = st.nextToken();
		}
		
		for(int i = 0; i< n; i++) {
			int c = 0;			// 카운트 
			int sum = 0;		// 누적
			
			for( int j = 0; j < a.length;j++) {
				if(a[i].charAt(j) == 'O') {
						c++;
				}
				else {
					c = 0;
				}
				sum += c;
			}
			System.out.println(sum);
		}
		
		
		
		
	}

}
