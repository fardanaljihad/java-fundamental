package ClassRelationship;

/**
 *
 * @author Fardan
 */
public class Point {
    // Attributes/states/data fields
    private int x;
    private int y;
    
    // Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    
    public void printPosisiTitik() {
        System.out.println("("+ getX() + "," + " " + getY() + ")");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}