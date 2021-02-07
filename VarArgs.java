public class VarArgs {

    //Method 1
    public static int  add(int a ,int b){
        return a+b;
    }
    public static int add1(int a ,int b ,int c){
        return a+b+c;
    }

    //Method 2
    public static int sum(int ...arr){
        // Available as int [] arr
        int result = 0;
        for(int a: arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args){

        //Method 1
        System.out.println("Method 1");
        System.out.println("The sum of two number is: "+ add(2,3));
        System.out.println("The sum of Three number is: "+ add1(2,4,5));
        // In this method we have to assign every number that we want to add

        System.out.println("");

        //Method 2
        System.out.println("Method 2");
        System.out.println("Sum is equal to: "+ sum());
        System.out.println("sum is equal to: "+ sum(2));
        System.out.println("Sum is equal to: "+ sum(2,3));
        System.out.println("Sum is equal to: "+ sum(2,3,6));
        System.out.println("Sum is equal to: "+ sum(2,3,3,7,3,5,7));
        // We can add as many numbers we want to....




    }
}

