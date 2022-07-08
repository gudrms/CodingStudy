package For;
//구구단

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 int N = sc.nextInt();
		 int M ;
		 sc.close();
		 
		 for( M = 1; M < 10; M++ ) {
			 System.out.println(N + " * " + M + " = " +N*M);
		 }
		 
		
	}
}	