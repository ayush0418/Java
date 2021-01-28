import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        System.out.print("Enter the table number: ");
        Scanner sc = new Scanner(System.in);
        int num =  sc.nextInt();

        for(int i =1 ; i<=10 ; i++)
        {
            System.out.printf("%d * %d = %d \n", num ,i ,num*i);
        }
    }
}
