import java.util.Scanner;

public class AreaOfRectangle
{
    public static void main(String[] args)
    {
        System.out.print("Enter the length of Rectangle: ");
        Scanner sc = new Scanner(System.in);
        float length = Float.parseFloat(sc.next());

        System.out.print("Enter the breath of Rectangle: ");
        float breath = Float.parseFloat(sc.next());

        float Area = (length * breath);
        System.out.println("Area of Rectangle is: " +Area);


    }
}
