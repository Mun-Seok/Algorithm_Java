package basic;

// 입력한 정숫값의 부호(양수/음수/0)를 판단
import java.util.Scanner;

public class JudgeSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요. : ");
        int num = sc.nextInt();

        if (num > 0)
            System.out.println("이 수는 양수입니다.");
        else if (num < 0)
            System.out.println("이 수는 음수입니다.");
        else
            System.out.println("이 수는 0입니다.");
    }
}
