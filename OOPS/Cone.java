class conical {
    private float radius;
    private float height;
    private float volume;
    private float  surfaceArea;

    public conical(float radius, float height) {
        this.radius = radius;
        this.height = height;
        System.out.println();
    }

    public double radius(){ return (radius); }
    public double height(){ return (height); }
    public double volume(){ return (Math.PI * radius * radius * height)/3 ; }               // Math.PI = 3.14******
    public double surfaceArea(){ return( (Math.PI * radius)* (radius + Math.sqrt(height*height +radius*radius) ) ); }

}


public class Cone {
    public static void main(String[] args) {
        conical a = new conical(12,12);
        System.out.println("Radius of cone is: "+ a.radius());
        System.out.println("Radius of cone is: "+ a.height());
        System.out.println("Volume of cone is: "+ a.volume());
        System.out.println("Surface Area of cone is: "+ a.surfaceArea());
    }
}
