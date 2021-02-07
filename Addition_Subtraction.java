public class Addition_Subtraction
{
    static int logic(int x, int y)
    {
        int z;
        if (x > y) {
            z = x + y;
        }
        else {
                z = x - y;
        }
        return z;
    }


    public static void main(String[] args) {
        int a1 = 5;
        int b1 = 10;
        int c1 = logic(a1, b1);

        int a2 = 10;
        int b2 = 5;
        int c2 = logic(a2, b2);
        System.out.println(c1);
        System.out.println(c2);
    }
}
