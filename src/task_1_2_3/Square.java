package task_1_2_3;

public class Square extends Rectangle{
    Square(){
        Rectangle obj = new Rectangle();
    }
    Square(double side){
        super(side,side);
    }
    Square(double side, String colour, boolean isFilled){
        super(side,side,colour,isFilled);
    }
    public double getSide(){
        return getLength();
    }


    public void setSide(double newSide) {
        super.setLength(newSide);
        super.setWidth(newSide);
    }
    @Override
    public String toString() {
        return ("Figure: [square]; Width["+getSide()+
                "]; Lenght: ["+ getSide() +
                "]; Area: [" + getArea() +
                "]; Perimeter: [" + getPerimeter()+
                "]; Colour: [" + getColour() +
                "]; Filled: [" + isFilled()+ "]");
    }
}
