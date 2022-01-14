package While;

import java.util.Scanner;

//수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
public class Main5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean bl;
		int c = 0;
		
		
		int i=0;
		int[] a = new int[10]; 
		while(i<a.length) {
			a[i] = sc.nextInt() %42;
			i++;
		}
		
		
		for(i=0;i<a.length;i++) {
			bl = false;
			for(int k=i+1;k<a.length; k++) {
				if(a[i] == a[k]) {
					bl = true;
					break;
				}
			}
			if( bl == false) {
				c++;
			}
		}
		System.out.println(c);
		
		sc.close();
	}

}
