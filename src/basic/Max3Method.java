package basic;

// 3개의 정숫값 가운데 최댓값을 구하여 출력
public class Max3Method {
    // a, b, c의 최댓값을 구하여 반환
    static int max3(int a, int b, int c) {
        int max = a; // 최댓값
        if (b > max)
            max = b;
        if (c > max)
            max = c;

        return max;
        }

    static int max4(int a, int b, int c, int d) {
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        if (d > max)
            max = d;

        return max;
    }
    static int min3(int a, int b, int c) {
        int min = a;
        if (b < min)
            min = b;
        if (c < min)
            min = c;

        return min;
    }
    static int min34(int a, int b, int c, int d) {
        int min = a;
        if (b < min)
            min = b;
        if (c < min)
            min = c;
        if (d < min)
            min = d;

        return min;
    }

    public static void main(String[] args) {
        System.out.println("max3(3, 2, 1) = " + max3(3, 2, 1));
        System.out.println("max3(1, 3, 2) = " + max3(1, 3, 2));
        System.out.println("max3(2, 1, 3) = " + max3(2, 1, 3));
    }
}
