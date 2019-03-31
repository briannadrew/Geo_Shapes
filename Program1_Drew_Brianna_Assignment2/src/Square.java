/*
Class: Square
Description: This class will essentially create a square that inherits from Rectangle class, which inherits from GeometricObject class.
             It creates the object, sets the lengths of each side of the square, and calculates and gets the area, perimeter, and name of
             shape. It overrides methods in superclass Rectangle to do this.
Superclass: GeometricObject & Rectangle
*/
class Square extends Rectangle{

    private double side; // initialize double representing the side lengths of the square
    private String className; // initialize string representing the name of the shape (class)

    /*
    Constructor: Square
    Description: creates a new object of Square with value from Test class and sets class name to Square
    Usage: in Test class (stored in gObjectArray)
    Parameters: double side (from Test class, represents the lengths of each side of the square)
    Return Type: N/A
    */
    public Square(double side){

        super(side, side); // pass equal side of square to superclass Rectangle both sides in Rectangle
        this.side = side; // set side to side length passed from object instantiation
        this.className = "Square"; // set class name to Square

    }

    /*
    Method: getArea
    Description: calculates and returns the area of the given object
    Usage: called in Test class, overrides method from Rectangle
    Parameters: none
    Return Type: double
    */
    public double getArea(){

        return Math.pow(side, 2); // calculates and returns the area of the given object

    }

    /*
    Method: getPerimeter
    Description: calculates and returns the perimeter of the given object
    Usage: called in Test class, overrides method from Rectangle
    Parameters: none
    Return Type: double
    */
    public double getPerimeter(){

        return side * 4; // calculates and returns the perimeter of the given object

    }

    /*
    Method: getClassName
    Description: returns the name of the class (Square)
    Usage: called in Test class, overrides method from Rectangle
    Parameters: none
    Return Type: string
    */
    public String getClassName(){

        return className; // returns the name of the class (Square)

    }
}
