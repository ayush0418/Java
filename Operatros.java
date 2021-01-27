public class Operatros
{
    public static void main(String[] args)
    {

        // Arithmetic Operators( + - * / % ++ -- )
        int a = 9;
        System.out.println("Arithmetic Operator");
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        a = a % 2;
        System.out.println(a);
        System.out.println();


        // Assignment Operators( =  += )
        int b = 4;
        b += 4;
        System.out.println("Assignment Operator");
        System .out.println(b);
        System.out.println();

        //Comparison Operators( == <= >= )
        System.out.println("Compariosn Operator");
        System.out.println(8>=8);
        System.out.println(8>8);
        System.out.println();

        //Logical Operator( && || ! )
        System.out.println("Logical Operator");
        System.out.println(54>45 && 54>34);
        System.out.println(54>32 && 54> 64);
        System.out.println();

        // Bitwise operator( & | )
        System.out.println("Bitwise Operator");              //   2       10
                                                             //   3       11
                                                             // ---------------
        System.out.println(2 | 3);                           //   |       11
        System.out.println(2 & 3);                           //   &       10
        System.out.println();
    }
}
