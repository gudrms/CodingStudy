package Main2;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		sc.close();
		
		if(90 <= A) {
			System.out.println("A");
		}else if(80 <= A) {
			System.out.println("B");
		}else if(70 <= A) {
			System.out.println("C");
		}else if(60 <= A) {
			System.out.println("D");
		}else if(true) {
			System.out.println("F");
		}
		
		
	}

}
