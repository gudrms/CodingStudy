package For;
//A+B를 여러 번 출력하는 문제
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();

		for(int C=0;C<T;C++) {
			int A=sc.nextInt(),B = sc.nextInt();
			System.out.println(A+B);
		}
	
	sc.close();	
	}

}
