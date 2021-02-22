public class Loops {
    public static void main(String[] args) {

        //WHILE LOOP   -> Checks the condition and then execute the code
        System.out.println("While Loop");
        int i=1;
        while (i<=5) {
            System.out.println(i);
            i++;
        }
        System.out.println();

        //DO-WHILE LOOP  -> Execute the code and then checks the condition
        //               -> It will execute the code for atleast one time even if the condition is false
        System.out.println("Do-While Loop");
        int a=1;
        do{
            System.out.println(a);
            a++;
        }while(a<5);
        System.out.println();

        //For Loop      ->  (Initialization ; Condition ; Increment) all are done in in statement
        //              ->  Mostly used when we know how many times we have to have execute the loop
        System.out.println("For Loop");
        for(int b=1;b<=5;b++){
            System.out.println(b);
        }

    }
}
