package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] arry = new int[N];

    for (int i = 0; i < N; i++) {
      arry[i] = sc.nextInt();
    }
    Arrays.sort(arry);
    System.out.println(arry[0] + " " + arry[N - 1]);
    sc.close();
  }

}
