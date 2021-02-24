class Phone{
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music...");
    }
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}
public class dynamicMethod {
    public static void main(String[] args) {

//        Phone obj1 = new Phone();
//        obj1.on();
//        obj1.showTime();

//        SmartPhone obj2 = new SmartPhone();
//        obj2.music();
//        obj2.on();
//        obj2.showTime();

// Example->  We upgrade from phone to smartphone not from smartphone to phone.....
        Phone obj3 = new SmartPhone();            // Allowed [object of subclass can be equal to superclass]
//      SmartPhone obj4 = new Phone();            // Not allowed
        obj3.showTime();
        obj3.on();
//      We can only call methods which is present in superclass
//      obj.music();                              // Not Allowed
    }
}