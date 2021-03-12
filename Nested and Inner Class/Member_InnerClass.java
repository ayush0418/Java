// A non-static class that is created inside a class but outside a method is called member inner class.

class Outer_Class{

     void display(){}
     class Inner_Class{
         void c()
        {
            System.out.println("This is Member Inner Class");
        }
    }
}

public class Member_InnerClass {
    public static void main(String[] args) {

        Outer_Class oc = new Outer_Class();
        Outer_Class.Inner_Class in =  oc.new Inner_Class();
        in.c();
    }
}