package Main3;
//1부터 N까지의 합을 구하는 문제.
import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int s = 0;
		
		for(int n = sc.nextInt();a<=n;a++) {
			s=a+s;
		}
		System.out.println(s);
		sc.close();
	}
}
