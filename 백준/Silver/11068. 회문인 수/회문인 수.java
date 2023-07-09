import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            long n = scanner.nextLong();
            System.out.println(isPalindromeInAnyBase(n));
        }
    }

    public static int isPalindromeInAnyBase(long n) {
        for (int B = 2; B <= 64; B++) {
            if (isPalindrome(n, B)) {
                return 1;
            }
        }
        return 0;
    }

    public static boolean isPalindrome(long n, int B) {
        long reversed = 0;
        long temp = n;
        while (temp > 0) {
            reversed = reversed * B + temp % B;
            temp /= B;
        }
        return reversed == n;
    }
}