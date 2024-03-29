package Function;

public class Main2 {
	public static void main(String[] args) {
		
		boolean[] check = new boolean[10001];
		
		for (int i = 1; i < 10001; i++) {
			int n =sum(i);
			
			if(n < 10001) {
				check[n] = true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i < 10001; i++) {
			if (!check[i]) {
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
	}	
	
	public static int sum(int number) {
		int sum = number;
		
		while(number != 0 ) {
			sum = sum + (number % 10);
			number = number/10;
		}
		
		return sum;
		
	}	
}
