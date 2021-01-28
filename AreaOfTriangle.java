import java.util.Scanner;

public class AreaOfTriangle
{
    public static void main(String[] args)
    {
        System.out.print("Enter the base value of Triangle: ");
        Scanner sc = new Scanner(System.in);
        float base = Float.parseFloat(sc.next());

        System.out.print("Enter the height of Triangle: ");
        float height = Float.parseFloat(sc.next());

        float Area = (base * height)/2;
        System.out.println("Area of Triangle is : " + Area );
    }
}
