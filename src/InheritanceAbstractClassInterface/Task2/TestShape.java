package InheritanceAbstractClassInterface.Task2;

/**
 *
 * @author Fardan
 */
public class TestShape {
    public static void main(String[] args) {
        // Declare and allocate a new instance of Shape
        // with default color and filled
        Shape s1 = new Shape();
        System.out.println(s1.toString());
        
        // Declare and allocate a new instance of Shape
        // with value color and filled
        Shape s2 = new Shape("red", false);
        System.out.println(s2.toString());
        
        // Declare and allocate a new instance of Circle
        // with value radius, color, and not filled
        Circle c1 = new Circle(7.0, "red", false);
        System.out.println(c1.toString());
        System.out.println("Luas = " + c1.getArea());
        System.out.println("Keliling = " + c1.getPerimeter() + "\n");
        
        // Declare and allocate a new instance of Circle
        // with value width, heigth, color, and not filled
        Rectangle r1 = new Rectangle(3.0, 5.0, "blue", true);
        System.out.println(r1.toString());
        System.out.println("Luas = " + r1.getArea());
        System.out.println("Keliling = " + r1.getPerimeter() + "\n");
        
        // Declare and allocate a new instance of Circle
        // with value width, heigth, color, and not filled
        Square sq1 = new Square(3.0, "yellow", true);
        System.out.println(sq1.toString());
        System.out.println("Luas = " + sq1.getArea());
        System.out.println("Keliling = " + sq1.getPerimeter());
    }
}
