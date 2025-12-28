import java.util.Scanner;

public class Swaping_two_numbers_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first = input.nextInt();
        System.out.println("Enter second number: ");
        int second = input.nextInt();
        first = first + second;
        second = first -  second;
        first = first - second;
        System.out.println("After swaping");
        System.out.println(first + " \n" + second);
    }
}
