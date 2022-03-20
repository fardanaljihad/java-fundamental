package ClassRelationship;

/**
 *
 * @author Fardan
 */
public class Point {
    // Attributes
    private int x;
    private int y;
    
    // Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    // Method
    public void printPoint() {
        System.out.println("(" + x + ", " + y + ")");
    }
}
