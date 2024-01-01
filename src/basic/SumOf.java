package basic;

// for 문으로 a부터 b까지의 합을 구하는 문제
import java.util.Scanner;

public class SumOf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("a부터 b까지의 합을 구합니다.");
        System.out.print("a값 : ");
        int a = sc.nextInt();
        System.out.print("b값 : ");
        int b = sc.nextInt();

        System.out.println(a + "부터 " + b + "까지의 합은 " + sumof(a, b) + "입니다.");
        }
    static int sumof(int a, int b) {
        int sum = 0;
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            sum += i;
        }

        return sum;
    }
}
