package InheritanceAbstractClassInterface.Task2;

/**
 *
 * @author Fardan
 */
public class Circle extends Shape{
    // Instance Variables
    private double radius;
    
    // Constructor
    public Circle() { // 1st constructor
        radius = 1.0;
    }
    
    public Circle(double radius) { // 2nd constructor
        this.radius = radius;
    }
    
    public Circle(double radius, String color, boolean filled) { // 3rd constructor
        super(color, filled);
        this.radius = radius;
    }
    
    // Getter and Setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    /** Returns the area of this Circle instance */
    public double getArea() {
        return radius*radius*Math.PI;
    }
    
    /** Returns the perimeter of this Circle instance */
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    
    /** Return a self-descriptive string of this instance in the form of 
    Circle[Shape[color=?, filled=?, radius=?]] */
    public String toString() {
        return "A Circle with radius = " + getRadius() + ", which is a subclass"
                + " of " + super.toString();
    }
}
