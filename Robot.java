enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT
}

public class Robot {

    Direction dir;
    int x, y;
    static int numberOfRobots = 0;

    public Robot (int x, int y, Direction dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
        numberOfRobots++;
    }

    public Direction getDirection() {
        return dir;
    }

    public int getX() {return x;}
    public int getY() {return y;}

    public void turnLeft() {

        switch (getDirection()) {
            case UP:
                dir = Direction.LEFT;
                break;
            case DOWN:
                dir = Direction.RIGHT;
                break;
            case LEFT:
                dir = Direction.DOWN;;
                break;
            case RIGHT:
                dir = Direction.UP;
                break;
        }

    }

    public void turnRight() {

        switch (getDirection()) {
            case UP:
                dir = Direction.RIGHT;
                break;
            case DOWN:
                dir = Direction.LEFT;
                break;
            case LEFT:
                dir = Direction.UP;
                break;
            case RIGHT:
                dir = Direction.DOWN;
                break;
        }

    }

    public void stepForward() {

        switch (getDirection()) {
            case UP:
                y++;
                break;
            case DOWN:
                y--;
                break;
            case LEFT:
                x--;
                break;
            case RIGHT:
                x++;
                break;
        }

    }

    public void toSpeak() {
        int x = getX();
        int y = getY();

        System.out.println("Координаты робота: x= " + x + " y= " + y);
    }
}

class SmartRobot extends Robot {

    public SmartRobot(int x, int y, Direction dir) {
        super(x,y,dir);
    }

    void moveRobot(int toX, int toY) {

        while (x != toX || y != toY) {

            if(x < toX) {
                dir = Direction.RIGHT;
            } else if(x > toX) {
                dir = Direction.LEFT;
            }

            if(y < toY) {
                dir = Direction.UP;
            } else if(y > toY)  {
                dir = Direction.DOWN;
            }

            stepForward();
            toSpeak();
        }
    }

    public static void main(String[] args)
    {
        SmartRobot r = new SmartRobot(0, 0, Direction.LEFT);
        r.moveRobot(6, 8);
    }
}



