// OVERRIDING ->   When child class uses the same method present in parent class again

class class1{                                                  // Parent Class
    public void method1(){                                     // a.method1 will run this METHOD
        System.out.println("I am method 1 of class 1");
    }
    public void method2(){                                     // a.method2 and b.method2 will run this METHOD
        System.out.println("I am method 2 of class 1");
    }

}

class class2 extends class1{               // Child Class
    @Override                              // Not necessary to use this keyword
    public void method1(){                 // b.method1 will run this METHOD
        System.out.println("I am method 1 of class 2");
    }
}
public class methodOverriding {
    public static void main(String[] args) {
        class1 a = new class1();
        a.method1();
        a.method2();

        class2 b = new class2();
        b.method1();
        b.method2();
    }
}
