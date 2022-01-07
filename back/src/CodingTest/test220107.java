package CodingTest;

public class test220107 {

	public static void main(String[] args) {
		// 1~10 홀수를 더하시오
		int y = 0;
		
		for(int x = 0; x < 10; x++) {
			if( x % 2 == 1 ) {
				y = x+ y;
			}
		}
		System.out.println(y);
	}

}
