package basic;

import java.util.Scanner;

public class Pyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("피라미드를 출력합니다.");

        do {
            System.out.print("몇 단 피라미드입니까?");
            n = sc.nextInt();
        } while (n <= 0);

        spira(n);
        npira(n);
    }

    static void spira(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= (i -1) * 2 + 1 ; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
    static void npira(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= (i -1) * 2 + 1 ; j++) {
                System.out.print(i % 10);
            }
            System.out.println();
        }
    }
}
