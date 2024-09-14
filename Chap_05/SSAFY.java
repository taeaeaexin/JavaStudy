package Chap_05;

import java.util.Scanner;

public class SSAFY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 지정
        int N = sc.nextInt();                   // N의 갯수
        int S = sc.nextInt();                   // 시작위치 S
        int max = S, min = S;                   // x 좌표 최대 최솟값
        int Narr[] = new int[N];                // N의 배열
        int sum = 0;                            // 이동 거리
        int f = S;                              // 현재위치 플래그
        int x = 0;                              // x 좌표

        // 방문해야 할 점, 최소 최댓값 저장
        for (int i = 0; i < N; i++) {
            Narr[i] = sc.nextInt();

            if (Narr[i] > max)
                max = Narr[i];
            else if (Narr[i] < min)
                min = Narr[i];
        }

        sc.close();

        boolean arr[][] = new boolean[max + 1][2];    // x 좌표 생성

        // x 좌표에 방문해야 할 점 표시
        for (int i = 0; i < N; i++) {
            arr[Narr[i]][0] = true;
        }

        // 방문 알고리즘
        System.out.print(S);
        for (int i = 0; i < N; i++) {
            int dis = 99; // 거리 초기화
            for (int j = min; j <= max; j++) {
                if (arr[j][0] == true && arr[j][1] == false && dis > Math.abs(f - j)) {
                    dis = Math.abs(f - j);
                    x = j;
                }
            }
            arr[x][1] = true;
            f = x;
            sum += dis;
            System.out.print(" -> " + f);
        }
        System.out.print("\n"+sum);
    }

}
