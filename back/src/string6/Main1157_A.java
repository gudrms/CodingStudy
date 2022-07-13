package string6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main1157_A {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] ABC = new int[26];
    String word = br.readLine().toUpperCase();

    for (int i = 0; i < word.length(); i++) {
      int num = word.charAt(i)-'A';
      ABC[num]++;
    }

    int max = -1;
    char result = '?';

    for (int i = 0; i < ABC.length; i++) {
      if(max < ABC[i]) {
        max = ABC[i];
        result = (char)(i+'A');
      }else if(max == ABC[i]){
        result = '?';
      }
    }

    System.out.println(result);
  }
}
