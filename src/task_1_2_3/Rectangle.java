package task_1_2_3;
public class Rectangle extends Shape{
    private double width; private double length;
    public Rectangle(){
        this.length = 0; this.width = 0; this.setColour("Blank"); this.setFilled(false);
    }
    public Rectangle(double width, double length){
        this.width = width; this.length = length;
        this.setColour("Blank"); this.setFilled(false);
    }
    public Rectangle(double width, double length, String colour, boolean isFilled){
        this.width = width; this.length = length;this.setColour(colour); this.setFilled(isFilled);
    }
    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    @Override
    public double getArea() {
        return length * width;
    }
    @Override
    public double getPerimeter() {
        return 2*(length+width);
    }
    @Override
    public String toString() {
        return ("Figure: [rectangle]; Width["+width+ "]; Lenght: ["+ length +
                "]; Area: [" + getArea() + "]; Perimeter: [" + getPerimeter()+
                "]; Colour: [" + getColour() + "]; Filled: [" + isFilled()+ "]");
    }
}
