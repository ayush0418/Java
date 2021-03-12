// A class i.e. created inside a method is called local inner class in java.
// If you want to invoke the methods of local inner class, you must instantiate this class inside the method.

public class Local_InnerClass {
    void display(){
        class Local{
            void a(){
                System.out.println("This is Local Inner Class");
            }
        }
        Local l = new Local();
        l.a();
    }

    public static void main(String args[]){
        Local_InnerClass obj = new Local_InnerClass();
        obj.display();
    }
}