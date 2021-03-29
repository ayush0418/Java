package Within_Package;

public class FileTwo {
    public static void main(String[] args) {

        withinPackage obj = new withinPackage();

//        System.out.println("Private age: "+ obj.age);
        System.out.println("Default Name: "+ obj.Name);
        System.out.println("Protected Branch: "+ obj.Branch);
        System.out.println("Public rollNo: "+ obj.rollNo);
    }
}
