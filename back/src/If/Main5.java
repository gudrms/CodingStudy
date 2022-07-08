package If;

import java.util.Scanner;

public class Main5 {
// 틀렸는데 왜그런지 모르겄슴
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		int M1 = M-45;
		sc.close();
		
		if( M1 > 0) {
			System.out.println(H+" "+M1);
		
		}else if( M1 < 0) {
			if(H-1< 0 ) {
			System.out.println((23)+" "+(60+M1));
			}else {
			System.out.println((H-1)+" "+(60+M1));
			}

}
	}
}
