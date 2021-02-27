
class Base1{                                           // Parent class of Base2, Base3 and Base4
    Base1(){                                           // DEFAULT CONSTRUCTOR
        System.out.println("I am a super class constructor");
    }
    Base1(int p){                                      // CONSTRUCTOR OVERLOADING WITH ONE PARAMETER
        System.out.println("I am an overloaded constructor with value of P as: " + p);
    }
}

class Base2 extends Base1{                             // Child class of Base1 and Parent class of Base3 & Base4
    Base2(){                                           // DEFAULT CONSTRUCTOR
         System.out.println("I am a Base2 class constructor");
    }
    Base2(int p, int q){                               // CONSTRUCTOR OVERLOADING WITH TWO PARAMETER
         super(p);                                     // Calls the constructor of parent class(i.e Base1) which takes one parameter
        System.out.println("I am an overloaded constructor of Derived with value of Q as: " + q);
    }
}

class Base3 extends Base2 {                            // Child class of Base1 & Base2 and Parent class of Base4
    Base3(){                                           // DEFAULT CONSTRUCTOR
        System.out.println("I am a Base3 class constructor");
    }
    Base3(int p, int q, int r){                        // CONSTRUCTOR OVERLOADING WITH THREE PARAMETER
        super(p, q);                                   // Calls the constructor of parent(i.e Base2) class which takes two parameter
        System.out.println("I am an overloaded constructor of Base2 with value of R as: " + r);
    }
}

class Base4 extends Base3{                             // Child class of Base 1, Base2, Base3
    Base4(){                                           // DEFAULT CONSTRUCTOR
        System.out.println("I am a Base4 class Constructor");
    }
    Base4(int p, int q, int r, int s){                 // CONSTRUCTOR OVERLOADING WITH THREE PARAMETER
                                                       // NO SUPER KEYWORD IS USED
        System.out.println("I am an Overloaded Constructor of Base3 Class" + s);
    }
}
public class constructor {
    public static void main(String[] args) {
        // Base1 a =  new Base1();                     // Prints Default Constructor of Base1 class
        // Base1 a1 = new Base1(11);                   // Prints Parameterized Constructor of Base1 class
        // Base2 b =  new Base2();                     // Prints Default Constructor of Base1 and Base2 class
        // Base2 b1 = new Base2(14, 9);                // Prints Parameterized Constructor of Base1 and Base2 class
        // Base3 c =  new Base3();                     // Prints Default Constructor of Base1, Base2 and Base3 class
        // Base3 c1 = new Base3(1, 2, 3);              // Prints Parameterized Constructor of Base1, Base2 and Base3 class
        // Base4 d = new Base4();                      // Prints Default Constructor of Base1, Base2, Base3 and Base4 class
        // Base4 d1 = new Base4(1,2,3,4);              // Prints Parameterized Constructor of Base4 class and Default Constructor of Base1, Base2 & Base3
    }
}
