package Main3;

import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int C = 1; C<=T; C++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int a = A+B;
			System.out.println("Case #"+C+": "+ a);
		}
		
		sc.close();
	}

}
