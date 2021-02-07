import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i=1;
        int factorial = 1;
        while(i<=n){
            factorial *= i;
            i++;
        }
        System.out.println("Factorial of " + n + " is " + factorial);


    }
}
