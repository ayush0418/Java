public class Method_Overloading {
    static void test(){
        System.out.println("Hello world");
    }

    static void test(String a){
        System.out.println("Good Morning " + a);
    }

    static void test(String a, String b ){
        System.out.println("Good Afternoon " +  a);
        System.out.println("Good Afternoon " +  b);
    }



    public static void main(String[] args){
        test();
        test("To all");
        test("People", "Everyone");
    }
}
