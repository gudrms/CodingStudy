package string6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
public class Main1157 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] count = new int[26];  // 26의 배열선언( 알파뱃)
    String s = br.readLine().toUpperCase();

    for (int i = 0; i < s.length(); i++) {
      int num = s.charAt(i) -'A';
      count[num]++;
    }

    int max = 0;
    char answer = '?';
    for (int i = 0; i < count.length; i++) {
      if(max < count[i]){
        max = count[i];
        answer = (char)(i+'A');
      }else if(max == count[i]) {
        answer ='?';
      }
    }
    System.out.println(answer);
  }
}
