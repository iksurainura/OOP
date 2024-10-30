 class TestCylinder {
    public static void main (String[] args) {
        // Declare and allocate a new instance of cylinder
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder:"
                + " radius=" + c1.getRadius()
                + " height=" + c1.getHeight()
                + " base area=" + c1.getArea()
                + " volume=" + c1.getvolume());

        // Declare and allocate a new instance of cylinder, specifying Height
        Cylinder c2 = new Cylinder(5.0);
        System.out.println("Cylinder:"
                        + " radius=" + c2.getRadius()
                        + " height=" + c2.getHeight()
                        + " base area=" + c2.getArea()
                        + " volume=" + c2.getvolume());

        // Declare and allocate a new instance of cylinder specifying radius and height
        Cylinder c3 = new Cylinder(5.0, 10.0);
        System.out.println("Cylinder:"
                + " radius=" + c3.getRadius()
                + " height=" + c3.getHeight()
                + " base area=" + c3.getArea()
                + " volume=" + c3.getvolume());
    }
}

class Cylinder extends Circle{
    private double height;
    public Cylinder(){}

    public Cylinder(double radius, String colour, double height) {
        super(radius, colour);
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getvolume(){
        return getArea()*height;
    }
    
    public double getArea(){
        return Math.PI*getRadius()*2;
    }
}

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder(3,"blue",5);
        cylinder.getvolume();
        System.out.println(cylinder.getArea());

    }
}