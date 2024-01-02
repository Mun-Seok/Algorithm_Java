package basic;

import java.util.Scanner;

// 가우스의 덧셈을 이용해 총합을 구하는 예제
public class GaussPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n값 : ");
        int n = sc.nextInt();

        int sum = (1 + n) * n/2;

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}
