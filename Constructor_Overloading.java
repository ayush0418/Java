class ClassName
{
    int a,b,c;
    ClassName(int x, int y)
    {
        a=x;
        b=y;
    }

    ClassName(int x)
    {
        a=b=x;
    }

    ClassName()
    {
        a=100;
        b=200;
        c= a+b;
    }
}

public class Constructor_Overloading
{
    public static void main(String[] args)
    {
        ClassName obj1 = new ClassName(30,50);
        System.out.println(obj1.a);
        System.out.println(obj1.b);

        ClassName obj2 = new ClassName(80);
        System.out.println(obj2.a);
        System.out.println(obj2.b);

        ClassName obj3 = new ClassName();
        System.out.println(obj3.a);
        System.out.println(obj3.b);
        System.out.println(obj3.c);

    }
}
