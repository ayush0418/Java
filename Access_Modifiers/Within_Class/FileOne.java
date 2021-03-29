package Within_Class;

class Student{
    public int rollNo = 1804;
    private int age = 20;
    protected String branch ="DevOps";
    String name ="Ayush";                   //default

    void display(){
        System.out.println("Private age" + age);
        System.out.println("Default name "+ name);
        System.out.println("protected branch" + branch);
        System.out.println("Public rollNo " + rollNo);
    }
}

public class FileOne {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
