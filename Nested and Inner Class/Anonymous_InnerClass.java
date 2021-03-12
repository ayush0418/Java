/*
  A class that have no name is known as anonymous inner class in java.
  It should be used if you have to override method of class or interface. Java Anonymous inner class can be created by two ways:
1. Class (may be abstract or concrete).
2. Interface
*/

interface Anonymous {
    void t();
}

public class Anonymous_InnerClass{
    public static void main(String args[]){
        Anonymous a = new Anonymous(){
            public void t(){
                System.out.println("Anonymous inner class");
            }
        };
        a.t();
    }
}

