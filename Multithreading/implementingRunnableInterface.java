class MyThread1 implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while(i<1000){
            System.out.println("Thread 1 is working");
            i++;
        }
    }
}

class MyThread2 implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while(i<1000){
            System.out.println("Thread 2 is working");
            i++;
        }
    }
}


public class implementingRunnableInterface {
    public static void main(String[] args) {
        MyThread1 A1 = new MyThread1();
        Thread B1 = new Thread(A1);

        MyThread2 A2 = new MyThread2();
        Thread B2 = new Thread(A2);

        B1.start();
        B2.start();
    }
}