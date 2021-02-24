class Base{
    public int x;

    public int getX() { return x; }
    public void setX(int x) {
        System.out.println("I am in Parent Class and setting X now");
        this.x = x;
    }
}
//base class is inherited by a new class "Derived"
class Derived extends Base{                          // "extends" keyword is used for inherit the properties of other class.
    public int y;

    public int getY() { return y; }
    public void setY(int y) {
        System.out.println("I am in Child Class and setting Y now");
        this.y = y;
    }
}

public class Basics {
    public static void main(String[] args) {

        // Creating an Object of base class
        Base ob1 = new Base();
        ob1.setX(4);                              //We can't set Y in base class
        System.out.println(ob1.getX());

        // Creating an object of derived class
        Derived ob2 = new Derived();
        ob2.setX(43);                             //We can set both X and Y in derived class because derived class has properties of base class also.
        System.out.println(ob2.getX());

        Derived ob3 = new Derived();
        ob3.setY(18);
        System.out.println(ob3.getY());
    }
}
