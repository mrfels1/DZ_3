package task_1_2_3;

public class Tester_task_2 {
    public static void main(String[] args) {
      Rectangle rectangle = new Rectangle(10, 20,"Red",true);
      Square square = new Square(5,"Green",true);
      Circle circle = new Circle(9,"Blue",false);

        System.out.println(rectangle.toString());
        System.out.println(square.toString());
        System.out.println(circle.toString());
        System.out.println();

        rectangle.setFilled(false);
        square.setSide(10);
        circle.setColour("Black");

        System.out.println(rectangle.toString());
        System.out.println(square.toString());
        System.out.println(circle.toString());
    }
}
