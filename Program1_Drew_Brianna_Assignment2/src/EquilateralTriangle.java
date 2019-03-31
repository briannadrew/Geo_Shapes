/*
Class: EquilateralTriangle
Description: This class will essentially create an equilateral triangle that inherits from Triangle class, which inherits from GeometricObject
             class. It creates the object, sets the length of the sides of the triangle, and gets the name of shape. getClassName method is
             overrides method in superclass Triangle.
Superclasses: GeometricObject & Triangle
*/
class EquilateralTriangle extends Triangle{

    private double side; // initialize double representing the side lengths of the equilateral triangle
    private String className; // initialize string representing the name of the shape (class)

    /*
    Constructor: EquilateralTriangle
    Description: creates a new object of EquilateralTriangle with value from Test class and sets class name to Equilateral Triangle
    Usage: in Test class (stored in gObjectArray)
    Parameters: double side (from Test class, represents the lengths of each side of the triangle)
    Return Type: N/A
    */
    public EquilateralTriangle(double side){

        super(side, side, side); // pass equal side of triangle to superclass Triangle to all 3 sides in Triangle
        this.side = side; // set side to side length passed from object instantiation
        this.className = "Equilateral Triangle"; // set class name to Equilateral Triangle

    }

    /*
    Method: getClassName
    Description: returns the name of the class (Equilateral Triangle)
    Usage: called in Test class, implemented using abstract method from GeometricObject, overrides method in superclass Triangle
    Parameters: none
    Return Type: string
    */
    public String getClassName(){

        return className; // returns class name Equilateral Triangle

    }

}
