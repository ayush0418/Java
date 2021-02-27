/*  DEFAULT METHOD   -->   Adding methods with implementation inside an interface.
                     -->   To declare default methods inside interfaces, we use the default keyword.                  */

interface MyCamera{
    void takeSnap();
    void recordVideo();
    default void record4KVideo(){                         //Default Method
        System.out.println("Recording in 4k...");
    }
}

class MySmartPhone  implements  MyCamera{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Recording video");
    }
}

class mobile {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();

        ms.record4KVideo();
        ms.takeSnap();
        ms.recordVideo();
    }
}