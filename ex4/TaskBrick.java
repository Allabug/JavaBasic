package task2.ex4;

public class TaskBrick {
    public String brickInHole(int a, int b, int x, int y, int z) {
        if(x <= a & y <= b || y <= a & x <= b ||
           x <= a & z <= b || z <= a & x <= b ||
           y <= a & z <= b || z <= a & y <= b) {
            return "Кирпич как то влез в отверстие";
        } else {
            return "Кирпич не влез, так как он больше отверстия";
        }

    }

    public static void main(String[] args) {
        TaskBrick brick = new TaskBrick();
        System.out.println(brick.brickInHole(10, 20, 5, 4, 3));
    }
}
