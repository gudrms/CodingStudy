package If;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 int A = sc.nextInt();
		 int B = sc.nextInt();
		 sc.close();
		 
		 if( A > B ) {
			 System.out.println(">");
		 }else if(A < B) {
			 System.out.println("<");
		 }else if(true) {
			 System.out.println("==");
		 }
		 
	    }
	}