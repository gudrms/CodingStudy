package While;
//세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 
//결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int[] a = new int[10];
		int S = A*B*C;
		
		while(S>0) {
			a[S % 10] ++;
			S /= 10;
		}
		
		for(int i =0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		sc.close();
	}
}
