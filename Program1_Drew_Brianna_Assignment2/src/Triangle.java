/*
Class: Triangle
Description: This class will essentially create a triangle that inherits from GeometricObject class. It creates the object, sets the
             lengths of each side of the triangle, and calculates and gets the area, perimeter, and name of shape. It implements methods
             from superclass GeometricObject to do this. It also overrides toString method in GeometricObject to concatenate the addition
             of the sides of the triangle as a string. getClassName method is also overridden by subclass EquilateralTriangle.
Superclass: GeometricObject
Subclass: EquilateralTriangle
*/
class Triangle extends GeometricObject{

    private String className = "Triangle"; // set default name of the shape (class) to Triangle
    private double side1 = 1.0, side2 = 1.0, side3 = 1.0; // set default lengths of all 3 sides of the triangle to 1.0

    /*
    Constructor: Triangle
    Description: creates a new object of Triangle with default values set in Triangle class
    Usage: in Test class (stored in gObjectArray)
    Parameters: none
    Return Type: N/A
    */
    public Triangle(){
    }

    /*
    Constructor: Triangle
    Description: creates a new object of Triangle with values from Test class and sets class name to Triangle
    Usage: none (would be in Test class)
    Parameters: double side1, double side2, and double3 (would be from Test class, represents the lengths of each side of the triangle)
    Return Type: N/A
    */
    public Triangle(double side1, double side2, double side3){

        this.side1 = side1; // set side1 to side length passed from object instantiation
        this.side2 = side2; // set side2 to side length passed from object instantiation
        this.side3 = side3; // set side3 to side length passed from object instantiation
        this.className = "Triangle"; // set class name to Triangle

    }

    /*
    Method: getArea
    Description: calculates and returns the area of the given object
    Usage: called in Test class, implemented using abstract method from GeometricObject
    Parameters: none
    Return Type: double
    */
    public double getArea(){

        // calculates and returns the area of the given object
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

    }

    /*
    Method: getPerimeter
    Description: calculates and returns the perimeter of the given object
    Usage: called in Test class, implemented using abstract method from GeometricObject
    Parameters: none
    Return Type: double
    */
    public double getPerimeter(){

        return side1 + side2 + side3; // calculates and returns the perimeter of the given object

    }

    /*
    Method: toString
    Description: returns for the given object the addition of the sides of the triangle as a concatenated string
    Usage: overrides toString method in class GeometricObject
    Parameters: none
    Return Type: string
    */
    public String toString(){

        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3; // returns for the given object the addition of the sides of the triangle as a concatenated string

    }

    /*
    Method: getClassName
    Description: returns the name of the class (Triangle)
    Usage: called in Test class, implemented using abstract method from GeometricObject, is overridden by subclass EquilateralTriangle
    Parameters: none
    Return Type: string
    */
    public String getClassName(){

        return className; // returns class name Triangle

    }

}
