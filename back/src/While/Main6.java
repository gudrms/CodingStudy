package While;
//  최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main6 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		double[] a = new double[Integer.parseInt(br.readLine())];
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for(int i = 0; i < a.length; i++) {
			a[i] = Double.parseDouble(st.nextToken());
		}
		
		double s = 0;
		Arrays.sort(a);
		
		for(int i = 0; i < a.length; i++) {
			s += ((a[i] / a[a.length-1]) *100);
		}
		System.out.println(s/a.length);
		
		
		
	}

}
