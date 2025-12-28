import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to find even number or odd number");
        int n = input.nextInt();
        if (n % 2 == 0) {
            System.out.println("even number");
        }
        else {
            System.out.println("odd number");
        }
    }
}
