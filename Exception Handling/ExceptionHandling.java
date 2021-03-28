import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExceptionHandling {

    public static void uncheckedException() {
        try {
            int arr[]= {1,3,5,7};
            System.out.println(arr[10]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

    public static void checkedException(){
        PrintWriter pw;
        try {
            pw = new PrintWriter("jtp.txt");
            pw.println("saved");
        }
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
        System.out.println("File saved successfully");
    }

    public static void multiCatch(){
        try{
            int a[]=new int[5];
            System.out.println(a[10]);
        }
        catch(ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e) {
            System.out.println("Parent Exception occurs");
        }
    }

    public static void nestedTryCatch(){
        try{

            try{
                System.out.println("Divide");
                int b =39/0;
            } catch(ArithmeticException e){ System.out.println(e);}

            try{
                int a[]=new int[5];
                a[5]=4;
            } catch(ArrayIndexOutOfBoundsException e){ System.out.println(e);}

            System.out.println("out of nested try...catch");
        }
        catch(Exception e){ System.out.println("Exception Handled");}

        System.out.println("out of try...catch");
    }

    public static void finallyBlock(){
        try{
            int data=25/0;
            System.out.println(data);
        }
        catch(ArithmeticException e){ System.out.println(e);}
        finally{ System.out.println("Final block");}
        System.out.println("out of try..catch");
    }

    public static void main(String[] args) {
        System.out.println("Unchecked Exception");
        uncheckedException();
        System.out.println();

        System.out.println("Checked Exception");
        checkedException();
        System.out.println();

        System.out.println("Multiple catch block");
        multiCatch();
        System.out.println();

        System.out.println("Nested try catch block");
        nestedTryCatch();
        System.out.println();

        System.out.println("Finally block");
        finallyBlock();
    }
}