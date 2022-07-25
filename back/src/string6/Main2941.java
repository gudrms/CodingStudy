package string6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2941 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String word = br.readLine();

    int count = 0;

    for (int i = 0; i < word.length(); i++) {
      if (word.charAt(i) == 'c' && i < word.length() - 1) {
        if (word.charAt(i + 1) == '=' || word.charAt(i + 1) == '-') {
          i++;
        }
      }
      else if (word.charAt(i) == 'd' && i < word.length() - 1) {
        if (word.charAt(i + 1) == '-') {
          i++;
        } else if ((word.charAt(i + 1) == 'z' && i< word.length() -2 )) {
          if (word.charAt(i + 2) == '=') {
            i += 2;
          }
        }
      }

       else if (word.charAt(i) == 'l' && i < word.length() - 1) {
          if (word.charAt(i + 1) == 'j') {
            i++;
          }
        }

        if (word.charAt(i) == 'n' && i < word.length() - 1) {
          if (word.charAt(i + 1) == 'j') {
            i++;
          }
        }

        if (word.charAt(i) == 's' && i < word.length() - 1) {
          if (word.charAt(i + 1) == '=') {
            i++;
          }
        }
        if (word.charAt(i) == 'z' && i < word.length() - 1) {
          if (word.charAt(i + 1) == '=') {
            i++;
          }
        }
       count++;
    }
    System.out.println(count);
  }
}