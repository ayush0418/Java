package Outside_Package_by_Subclass_only;
import AccessModifiers.*;

class A extends Modifiers{
    void display() {
//        System.out.println("Private age: " + age);
//        System.out.println("Default Name" + Name);
        System.out.println("Protected: " + Branch);
        System.out.println("Public: "+ rollNo );

    }
}

public class FileThree {
    public static void main(String[] args) {

        A obj1 = new A();
        obj1.display();
    }
}
