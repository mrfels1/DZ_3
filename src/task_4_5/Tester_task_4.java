package task_4_5;

public class Tester_task_4 {

    public static void main(String[] args) {
        MovableCircle movableCircle = new MovableCircle(0,0,5,5,5);

        System.out.println(movableCircle.toString());
        movableCircle.moveDown();
        movableCircle.moveLeft();
        System.out.println(movableCircle.toString());
    }

}
