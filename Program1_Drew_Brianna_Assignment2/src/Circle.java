/*
Class: Circle
Description: This class will essentially create a circle that inherits from GeometricObject class. It creates the object, gets/sets the
             values of x and y representing the centre of the circle as well as the radius, and calculates and gets the area, perimeter,
             and name of shape. It implements methods from superclass GeometricObject to do this.
Superclass: GeometricObject
*/
class Circle extends GeometricObject{

    private double x = 0.0, y = 0.0, radius = 1.0; // sets both of the default values representing the centre of the circle to 0.0 and the default value of the radius of the circle to 1.0
    private String className = "Circle"; // set default name of the shape (class) to Circle

    /*
    Method: getX
    Description: returns the X value representing the centre of the circle of the given object
    Usage: none (would be in Test class)
    Parameters: none
    Return Type: double
    */
    public double getX(){

        return x; // returns x value representing the centre of the circle

    }

    /*
    Method: getY
    Description: returns the y value representing the centre of the circle of the given object
    Usage: none (would be in Test class)
    Parameters: none
    Return Type: double
    */
    public double getY(){

        return y; // returns y value representing the centre of the circle

    }

    /*
    Method: getRadius
    Description: returns the radius of the given object
    Usage: none (would be in Test class)
    Parameters: none
    Return Type: double
    */
    public double getRadius(){

        return radius; // returns radius of the circle

    }

    /*
    Constructor: Circle
    Description: creates a new object of Circle with default values set in Circle class
    Usage: in Test class (stored in gObjectArray)
    Parameters: none
    Return Type: N/A
    */
    public Circle(){
    }

    /*
    Constructor: Circle
    Description: creates a new object of Circle with values from Test class and sets class name to Circle
    Usage: none (would be in Test class)
    Parameters: double x and double y (would be from Test class, represents the centre of the circle), and double radius (would be from Test class, represents the radius of the circle)
    Return Type: N/A
    */
    public Circle(double x, double y, double radius){

        this.x = x; // set x value representing centre of circle to value passed from object instantiation
        this.y = y; // set y value representing centre of circle to value passed from object instantiation
        this.radius = radius; // set radius to radius passed from object instantiation
        this.className = "Circle"; // set class name to Circle

    }

    /*
    Method: getArea
    Description: calculates and returns the area of the given object
    Usage: called in Test class, implemented using abstract method from GeometricObject
    Parameters: none
    Return Type: double
    */
    public double getArea(){

        return Math.PI * Math.pow(radius, 2); // calculates and returns the area of the given object

    }

    /*
    Method: getPerimeter
    Description: calculates and returns the perimeter of the given object
    Usage: called in Test class, implemented using abstract method from GeometricObject
    Parameters: none
    Return Type: double
    */
    public double getPerimeter(){

        return 2 * Math.PI * radius; // calculates and returns the perimeter of the given object

    }

    /*
    Method: getClassName
    Description: returns the name of the class (Circle)
    Usage: called in Test class, implemented using abstract method from GeometricObject
    Parameters: none
    Return Type: string
    */
    public String getClassName(){

        return className; // returns class name Circle

    }

}
