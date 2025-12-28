import java.util.Scanner;

public class Factors_count {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter a number to find their factors : ");
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            if(num % i == 0){
                count = count +1;
                System.out.println(i);
            }
        }
        System.out.println("no.of factorials ="+count);
    }
}
