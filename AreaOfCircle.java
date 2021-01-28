import java.util.Scanner;

public class AreaOfCircle
{
        public static void main(String[] args)
        {
            System.out.print("Enter the radius of Circle: ");
            Scanner sc = new Scanner(System.in);
            float radius = Float.parseFloat(sc.next());

            double Area = (3.14 * radius * radius);
            System.out.println("Area of Circle is: " +Area);


        }


}
