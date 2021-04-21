class Thr1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<100){
            System.out.println("Thread 1 is working");
            i++;
        }
    }
}


class Thr2 extends Thread{
    @Override
    public void run(){
        int i= 0;
        while (i<100){
            System.out.println("Thread 2 is working");
            i++;
        }
    }
}

public class joinMethod {
    public static void main(String[] args) {
        Thr1 t1 = new Thr1();
        Thr2 t2 = new Thr2();
        t1.start();

        try{
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }

        t2.start();

    }
}