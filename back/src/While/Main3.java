package While;
//먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 
//각 자리의 숫자를 더한다. 그 다음, 주어진 수의 가장 오른쪽 자리 수와
//앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.close();
		
		int cnt = 0;
		int copy = N;
		
		while(true) {
			N = ((N%10)*10)+(((N/10)+(N%10))%10); 
			cnt++;
			
			if(copy == N) {
				break;
			}
		}
		System.out.println(cnt);
	}

}
