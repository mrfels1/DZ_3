package task_1_2_3;

public class Tester_task_3 {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5,"red",false);

        System.out.println(s1); // Circle
        System.out.println(s1.getArea()); // Circle
        System.out.println(s1.getPerimeter()); //
        System.out.println(s1.getColour());
        System.out.println(s1.isFilled());
        System.out.println(((Circle) s1).getRadius()); //недоступен без приведения типов

        Circle c1 = (Circle)s1; // приведение типов
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColour());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        //Shape s2 = new Shape(); //Не скомпелируется тк shape нельзя инициализировать

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // приведение типов
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColour());
        System.out.println(((Rectangle) s3).getLength());//необходимо приведение типов

        Rectangle r1 = (Rectangle)s3; // приведение типов
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColour());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6); // приведение типов
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColour());
        System.out.println(((Square) s4).getSide());//необходимо приведение типов

        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColour());
        //System.out.println(r2.getSide()); (Не скомпелируется из-за несоответствия типов)
        System.out.println(r2.getLength());

        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColour());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}
