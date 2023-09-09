package task_4_5;

public class Tester_task_5 {
    public static void main(String[] args) {
        MovableRectangle movableRectangle = new MovableRectangle(0,2,0,-2,5,5);
        System.out.println(movableRectangle.toString());
        movableRectangle.moveUp();
        movableRectangle.moveRight();
        System.out.println(movableRectangle.toString());
    }
}
