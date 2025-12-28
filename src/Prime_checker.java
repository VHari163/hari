import java.util.Scanner;

public class Prime_checker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        System.out.println("enter a number to check it is prime or not: ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count = count + 1;
            }
        }
        if(count <= 2){
            System.out.println(n +" is a Prime number");
        }
        else{
            System.out.println(n +" is Not a Prime number");
        }
    }
}
