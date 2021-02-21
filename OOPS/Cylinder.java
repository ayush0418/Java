class cylinderical
{
    private float radius;
    private float height;
    private float volume;
    private float  surfaceArea;

    public float getRadius() { return radius; }
    public void setRadius(float radius) { this.radius = radius; }

    public float getHeight() { return height; }
    public void setHeight(float height) { this.height = height; }

    public double volume(){ return 3.14 * radius * radius * height; }                // we can use Math.PI for 3.14
    public double surfaceArea(){ return (2 * 3.14 * radius) * (radius + height); }

}

public class Cylinder {
    public static void main(String[] args) {
        cylinderical a = new cylinderical();
        //Setting the values
        a.setHeight((float) 5.6);
        a.setRadius((float) 10);
        //Printing the values
        System.out.println("Height of cylinder is: "+ a.getHeight());
        System.out.println("Radius of cylinder is: "+ a.getRadius());
        System.out.println("Volume of Cylinder is: "+ a.volume());
        System.out.println("Surface Area of Cylinder is: "+ a.surfaceArea());

    }
}
