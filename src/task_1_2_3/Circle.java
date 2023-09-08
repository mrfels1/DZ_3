package task_1_2_3;

import static java.lang.Math.pow;

public class Circle extends Shape{
    private double radius;
    Circle(){
        this.radius = 0;
        this.setColour("Blank");
        this.setFilled(false);
    }
    Circle(double radius, String colour,boolean isFilled){
        this.radius = radius;
        this.setColour(colour);
        this.setFilled(isFilled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14*pow(radius,2.0);
    }

    @Override
    public double getPerimeter() {
        return 2*3.14*radius;
    }

    @Override
    public String toString() {
        return ("Figure: [circle]; Radius["+radius+
                "]; Area: [" + getArea() +
                "]; Perimeter: [" + getPerimeter()+
                "]; Colour: [" + getColour() +
                "]; Filled: [" + isFilled()+ "]");
    }
}
