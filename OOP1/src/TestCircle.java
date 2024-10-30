public class TestCircle {
    public class Circle {
        // private instance variables, not accessible from outside the class
        private String colour;
        private double radius;

        // default constructor with no arguments
        public Circle(){
            radius = 1;
            colour = "Blue";
        }

        // second constructor takes as argument the radius but has default colour
        public Circle(double r){

            radius = r;
            colour = "Blue";
        }

        // public method to retrieve the radius
        public double getRadius(){
            return radius;
        }


        // public method to compute and return the area of circle
        public double getArea(){
            return radius*radius*Math.PI;
        }
    }
}
