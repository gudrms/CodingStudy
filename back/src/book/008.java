package book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 백준 1253
public class book {

    public static void main(String[] args) throws NumberFormatException,IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());                        // 배열의 수
        int Result = 0;                                                 // 좋은수의 수
        long[] A = new long[N];                                         // 배열
        StringTokenizer st = new StringTokenizer(bf.readLine());

        for(int i = 0; i<N; i++){
            A[i] = Long.parseLong(st.nextToken());                      // 배열에 값넣기

        }
        Arrays.sort(A);                                                 // 배열 정렬
        for (int k = 0; k < N; k++) {                                   // 대상 값
            long find = A[k];                                           //
            int i = 0;                                                  // 앞의 수
            int j = N-1;                                                // 뒤의 수

            while (i < j) {
                if (A[i] + A[j] == find) {                               // i+j가 대상값과 같으면
                    if (i != k && j != k) {                              // i와 k의 인덱스가 다르면
                        Result++;                                       // 좋은수의 값을 ++
                        break;
                    } else if (i == k) {                                // i인덱스와 k가 같으면 i 증가
                        i++;
                    } else if (j == k) {
                        j--;
                    }
                } else if (A[i] + A[j] < find) {                        // i+j != k 일때  보다 작으면 i 증가
                    i++;

                } else {
                    j--;
                }
            }
        }
        System.out.println(Result);
        bf.close();



    }
}