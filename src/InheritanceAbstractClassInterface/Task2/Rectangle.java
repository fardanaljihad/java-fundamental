package InheritanceAbstractClassInterface.Task2;

/**
 *
 * @author Fardan
 */
public class Rectangle extends Shape {
    // Instance Variables
    private double width;
    private double length;
    
    // Constructor
    public Rectangle() {
        width = 1.0;
        length = 1.0;
    }
    
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    
    // Getter and Setter
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    /** Returns the area of this Circle instance */
    public double getArea() {
        return width*length;
    }
    
    /** Returns the perimeter of this Circle instance */
    public double getPerimeter() {
        return (2*width) + (2*length);
    }
    
    /** Return a self-descriptive string of this instance in the form of 
    Rectangle[Shape[color=?, filled=?, width=?, length=?]] */
    public String toString() {
        return "A Rectangle with width = " + getWidth() + " and length = " 
                + getLength() + ", which is a subclass of " + super.toString();
    }
}
