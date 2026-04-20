package com.xxxx;

public class MathUtils {

    // 1. Chu vi HCN
    public static int rectanglePerimeter(int a, int b) {
        if (a <= 0 || b <= 0) throw new IllegalArgumentException();
        return 2 * (a + b);
    }

    // 2. Diện tích HCN
    public static int rectangleArea(int a, int b) {
        if (a <= 0 || b <= 0) throw new IllegalArgumentException();
        return a * b;
    }

    // 3. Giải PT bậc 2
    public static String quadratic(int a, int b, int c) {
        if (a == 0) {
            if (b == 0) return "No solution";
            return "x=" + (-c * 1.0 / b);
        }
        double delta = b * b - 4 * a * c;
        if (delta < 0) return "No solution";
        if (delta == 0) return "x=" + (-b / (2.0 * a));
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        return "x1=" + x1 + ",x2=" + x2;
    }

    // 4. Ngày trong tháng
    public static int daysInMonth(int m, int y) {
        if (m < 1 || m > 12) throw new IllegalArgumentException();
        switch (m) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeap(y) ? 29 : 28;
        }
        return 0;
    }

    private static boolean isLeap(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }

    // 5. Số nguyên tố
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    // 6. Tổng luân phiên
    public static int alternatingSum(int n) {
        if (n <= 0) throw new IllegalArgumentException();
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += (i % 2 == 0) ? -i : i;
        return sum;
    }

    // 7. UCLN
    public static int gcd(int a, int b) {
        if (a < 0 || b < 0) throw new IllegalArgumentException();
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // 8. Tổng giai thừa
    public static int factorialSum(int n) {
        if (n <= 0) throw new IllegalArgumentException();
        int sum = 0;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
            sum += fact;
        }
        return sum;
    }
}