import java.util.Scanner;

public class Swaping_two_numbers_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int first = input.nextInt();
        System.out.println("Enter second number");
        int second = input.nextInt();
        System.out.println("before swaping");
        System.out.println(first+"\n"+second);
        int temp;
        temp = first;
        first = second;
        second = temp;
        System.out.println("after swaping");
        System.out.println(first + " \n" + second);
    }
}
