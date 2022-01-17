package Function;
//n개의 합을 구하는 함수
public class Main1 {	
	long sum(int[] a) {
		long sum  = 0;
		
		for(int i = 0; i<a.length; i++) {
			sum += a[i];
		}
		
		return sum ;
	}		
}