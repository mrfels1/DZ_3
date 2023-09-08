package task_1_2_3;

public abstract class Shape {
    private String colour;
    private boolean isFilled;
    public Shape(){};
    public Shape(String colour, Boolean isFilled){
        this.colour = colour;
        this.isFilled = isFilled;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    @Override
    public abstract String toString();
}
