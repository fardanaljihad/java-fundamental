package InheritanceAbstractClassInterface.Task2;

/**
 *
 * @author Fardan
 */
public class Shape {
    // Instance Variables
    private String color;
    private boolean filled;
    
    // Constructors
    public Shape() { // 1st constructor
        color = "green";
        filled = true;
    }
    
    public Shape(String color, boolean filled) { // 2nd constructor
        this.color = color;
        this.filled = filled;
    }
    
    // Getter and Setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    /** Return a self-descriptive string of this instance in the form of 
    Circle[radius=?,color=?] */
    public String toString() {
        if(isFilled()) {
            return "A Shape with color of " + getColor() + " and filled";
        }
        else {
            return "A Shape with color of " + getColor() + " and not filled";
        }
    }
}
