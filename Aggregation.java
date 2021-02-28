class car{
    String color;
    seat s;                 //AGGREGATION

    car(String c,  seat t){
        color = c;
        s = t;
    }
}

class seat{
    int cost;
    String material;

    seat(int c,String m){
        cost = c;
        material = m;
    }
}

public class Aggregation {
    public static void main(String[] args) {
        seat s1 = new seat(10000,"cotton");
        seat s2 = new seat(20000,"synthetic");
        car c1 = new car("Red",s1);
        car c2 = new car("Yellow",s2);

        System.out.println("FIRST CAR DETAILS: ");
        System.out.println("Car Colour: " + c1.color);
        System.out.println("Car Seat cost: " + c1.s.cost);
        System.out.println("Car material type: " + c1.s.material);

        System.out.println();

        System.out.println("SECOND CAR DETAILS: ");
        System.out.println("Car Colour: " + c2.color);
        System.out.println("Car Seat cost: " + c2.s.cost);
        System.out.println("Car material type: "+ c2.s.material);
    }
}