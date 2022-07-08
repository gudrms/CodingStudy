package book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 2750 수 정렬하기1
public class T015 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());          // 전체 수 갯수
        int[] A = new int[N];                                           // 배열 a

        for (int i = 0; i < N; i++) {                                   // 배열 A에 값 입력
            A[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        for (int i = 0; i < N-1; i++) {                                 // 앞에 배열 다시 확인

            for (int j = 0; j < N-1-i; j++) {                           // 나란한 두수 비교  -1은 한바퀴 돌때마다 가장 뒤에 수가 가장 크기에
                if (A[j] > A[j + 1]) {
                    int temp = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = temp;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.println(A[i]);
        }
    }

}