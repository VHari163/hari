import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int factorial = 1;
        System.out.println("Enter a number to find a factorial of it:");
        int n = input.nextInt();
        if (n >= 0) {
            if (n > 0) {
                for (int i = 1; i <= n; i++) {
                    factorial = factorial * i;
                }
                System.out.println("factorial of " + n + " is " + factorial);
            } else {
                System.out.println("factorial of " + n + " is " + factorial);
            }
        }
        else {
            System.out.println("cannot find factorial for -ve numbers 🥰 ");
        }
    }
}
