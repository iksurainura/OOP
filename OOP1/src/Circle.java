public class Circle {
    private double radius=1;
    private String colour="Blue";

    public Circle(double radius,String colour) {
        this.colour = colour;
        this.radius=radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
}
