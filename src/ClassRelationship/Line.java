package ClassRelationship;

/**
 *
 * @author Fardan
 */
public class Line {
    // Attributes
    Point pStart;
    Point pFinish;
    
    // Constructor
    public Line(Point pStart, Point pFinish) {
        this.pStart = pStart;
        this.pFinish = pFinish;
    }
    
    // Method
    public void printLine() {
        System.out.print("Titik awal : ");
        pStart.printPoint();
        System.out.print("Titik akhir: ");
        pFinish.printPoint();
    }
}
