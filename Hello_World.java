import java.util.Scanner;

public class Hello_World
{
    public static void main(String[] args)
    {
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " + name + " how are you?");
    }
}
