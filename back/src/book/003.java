package book;
// 백준 11659

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class book {

    public static void main(String[] args) throws IOException{
        BufferedReader  bufferedReader =
            new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer =
            new StringTokenizer(bufferedReader.readLine());
        int suNo = Integer.parseInt(stringTokenizer.nextToken());       // 숫자개수
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());     // 질의 개수
        long[] S = new long[suNo + 1];                                  // 합배열 선언( 숫자갯수 +1 0번째 인덱스에 0을 넣기위해
        stringTokenizer = new StringTokenizer(bufferedeader.readLine());
        for(int i = 1; i <= suNo; i++){                                 // 합배열 공식 (값 채우기 ex) 5개 배열의 합은 4개 + 5번째
            S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }
        for(int q = 0; q < quizNo; q++){                                // 질의 개수 만큼 계산
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());      //
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[j] - S[i-1]);                          // ex) 2-4  2번에서 4인덱스까지 의 합 = 4번인덱스까지의 합 - 1번 인덱스
        }
    }
}