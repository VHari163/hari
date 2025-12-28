import java.util.Scanner;

public class Count_no {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        while(num > 0){
            count++;
            num = num / 10;
        }
        System.out.println("no.of elements in given integer = "+count);
    }
}