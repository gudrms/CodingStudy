package For;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램  , 내가푼
public class Main8 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int C = 1; C<=T; C++) {
			int A = Integer.parseInt(br.readLine());
			int B = Integer.parseInt(br.readLine());
			int a = A+B;
			System.out.println("Case #"+C+": "+A+" + "+B +" = "+ a );
		}
		br.close();
	}
}
