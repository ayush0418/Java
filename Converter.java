import java.util.Scanner;

public class Converter
{
    public static void main(String[] args)
    {
        System.out.println("Enter the value in Killometer");
        Scanner sc = new Scanner(System.in);
        float km = Float.parseFloat(sc.next());
        float meter = 1000*km;

        System.out.println(km + " Kilometer is " + meter+ " Meter");
    }
}

