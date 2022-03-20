package ClassRelationship;

/**
 *
 * @author Fardan
 */
public class DependenceExample {

    public static void main(String[] args) {
        Point pStart = new Point(1, 1);
        Point pFinish = new Point(7, 1);
        
        Line L = new Line(pStart, pFinish);
        
        L.printLine();
    }
    
}
