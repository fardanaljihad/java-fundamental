package ClassRelationship;

/**
 *
 * @author Fardan
 */
public class Line {
    // Attributes/states/data fields
    private Point pointStart;
    private Point pointFinish;
    
    // Constructor
    public Line(Point pointStart, Point pointFinish) {
        this.pointStart = pointStart;
        this.pointFinish = pointFinish;
    }
    
    public void printLine() {
        System.out.println("Titik awal dari garis : ");
        pointStart.printPosisiTitik();
        System.out.println("Titik akhir dari garis :");
        pointFinish.printPosisiTitik();
    }
}