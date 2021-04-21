class Thread1 extends Thread{
   long counter1 = 0;

   public void run(){
       while (true){
           counter1 = counter1 +1;
       }
   }
}


class Thread2 extends Thread{
    long counter2 = 0;

    public void run(){
        while (true){
            counter2 = counter2 +1;
        }
    }
}


public class methods {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.setName("First Thread");
        t2.setName("Second Thread");
        t1.setPriority(1);
        t2.setPriority(10);

        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.start();
        t2.start();

        try{
            Thread.currentThread().sleep(100);
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Counter1: " + t1.counter1);
        System.out.println("Counter2: " + t2.counter2);

        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());
        t1.stop();
        t2.stop();
    }
}
