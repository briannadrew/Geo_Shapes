/*
Class: Rectangle
Description: This class will essentially create a rectangle that inherits from GeometricObject class. It creates the object, sets the
             lengths of each side of the rectangle, and calculates and gets the area, perimeter, and name of shape. It implements methods
             from superclass GeometricObject to do this. These methods are also overridden by subclass Square.
Superclass: GeometricObject
Subclass: Square
*/
class Rectangle extends GeometricObject{

    private String className = "Rectangle"; // set default name of the shape (class) to Rectangle
    private double side1 = 1.0, side2 = 1.0; // set default lengths of all sides of the rectangle to 1.0

    /*
    Constructor: Rectangle
    Description: creates a new object of Rectangle with default values set in Rectangle class
    Usage: in Test class (stored in gObjectArray)
    Parameters: none
    Return Type: N/A
    */
    public Rectangle(){ }

    /*
    Constructor: Rectangle
    Description: creates a new object of Rectangle with values from Test class and sets class name to Rectangle
    Usage: none (would be in Test class)
    Parameters: double side1 and double side2 (would be from Test class, represents the lengths of each side of the rectangle)
    Return Type: N/A
    */
    public Rectangle(double side1, double side2){

        this.side1 = side1; // set side1 to side length passed from object instantiation
        this.side2 = side2; // set side2 to side length passed from object instantiation
        this.className = "Rectangle"; // set class name to Rectangle

    }

    /*
    Method: getArea
    Description: calculates and returns the area of the given object
    Usage: called in Test class, implemented using abstract method from GeometricObject
    Parameters: none
    Return Type: double
    */
    public double getArea(){

        return side1 * side2; // calculates and returns the area of the given object

    }

    /*
    Method: getPerimeter
    Description: calculates and returns the perimeter of the given object
    Usage: called in Test class, implemented using abstract method from GeometricObject
    Parameters: none
    Return Type: double
    */
    public double getPerimeter(){

        return (side1 * 2) + (side2 * 2); // calculates and returns the perimeter of the given object

    }

    /*
    Method: getClassName
    Description: returns the name of the class (Rectangle)
    Usage: called in Test class, implemented using abstract method from GeometricObject, is overridden by subclass Square
    Parameters: none
    Return Type: string
    */
    public String getClassName(){

        return className; // returns class name Rectangle

    }

}
