/*
Class: GeometricObject
Description: This class will essentially create a shape as a super class, with other classes representing these specific types of shapes
             inheriting from this class. It creates the object, gets/sets the colour, whether it is filled or not, and the date it was
             created. It also defines abstract methods to be implemented in subclasses to get the perimeter, area, and name of the shape.
             Includes a method to concatenate attributes of object into a string that is overridden and overrides as well.
Subclasses: Triangle, Rectangle, Circle, EquilateralTriangle, and Square
*/
public abstract class GeometricObject {

    private String colour = "white"; // set default colour of GeometricObject object to white
    private boolean filled; // truth value of whether the GeometricObject object is filled or not
    private java.util.Date dateCreated; // date the GeometricObject object was created

    /*
    Constructor: GeometricObject
    Description: creates a new object of GeometricObject with default values set in GeometricObject class and stores the date it was created
    Usage: in Test class (created an array of GeometricObject)
    Parameters: none
    Return Type: N/A
    */
    protected GeometricObject(){

        dateCreated = new java.util.Date(); // store date object was created

    }

    /*
    Constructor: GeometricObject
    Description: creates a new object of GeometricObject with values from Test class and stores the date it was created
    Usage: none (would be in Test class)
    Parameters: string colour (would be from Test class, colour of given object), boolean filled (would be from Test class, truth value of whether the given object is filled or not)
    Return Type: N/A
    */
    protected GeometricObject(String colour, boolean filled){

        dateCreated = new java.util.Date(); // store date object was created
        this.colour = colour; // set colour to colour passed from object instantiation
        this.filled = filled; // set filled truth value to truth value passed from object instantiation

    }

    /*
    Method: getColour
    Description: returns the colour of the given object
    Usage: none
    Parameters: none
    Return Type: string
    */
    public String getColour(){

        return colour; // return colour of given object

    }

    /*
    Method: setColour
    Description: sets the colour of the given object
    Usage: none
    Parameters: string colour (would be from Test class, colour of the given object)
    Return Type: void
    */
    public void setColour(String colour){

        this.colour = colour; // set colour of given object to colour passed

    }

    /*
    Method: isFilled
    Description: returns the truth value of whether the given object is filled or not
    Usage: none
    Parameters: none
    Return Type: boolean
    */
    public boolean isFilled(){

        return filled; // return truth value of whether the given object is filled or not

    }

    /*
    Method: setFilled
    Description: sets the truth value of whether the given object is filled or not
    Usage: none
    Parameters: boolean filled (would be from Test class, truth value of whether the given object is filled or not
    Return Type: void
    */
    public void setFilled(boolean filled){

        this.filled = filled; // set truth value of whether the given object is filled or not to truth value passed

    }

    /*
    Method: getDateCreated
    Description: returns the date the given object was created
    Usage: none
    Parameters: none
    Return Type: java.util.Date
    */
    public java.util.Date getDateCreated(){

        return dateCreated; // return date the given object was created

    }

    /*
    Method: toString
    Description: returns for the given object the date created, colour, and whether it is filled or not as a concatenated string
    Usage: overrides method for Object, is overridden in Triangle class
    Parameters: none
    Return Type: string
    */
    @Override
    public String toString(){

        return "created on " + dateCreated + "\ncolour: " + colour + " and filled: " + filled; // returns for the given object the date created, colour, and whether it is filled or not as a concatenated string

    }

    /*
    Method: getArea
    Description: returns the area of the given object for each class it's implemented in
    Usage: called in Test class, implemented in Triangle, Rectangle, Circle, and Square classes
    Parameters: none
    Return Type: abstract
    */
    public abstract double getArea();

    /*
    Method: getPerimeter
    Description: returns the perimeter of the given object for each class it's implemented in
    Usage: called in Test class, implemented in Triangle, Rectangle, Circle, and Square classes
    Parameters: none
    Return Type: abstract
    */
    public abstract double getPerimeter();

    /*
    Method: getClassName
    Description: returns the name of the class for each class it's implemented in
    Usage: called in Test class, implemented in Triangle, Rectangle, Circle, EquilateralTriangle, and Square classes
    Parameters: none
    Return Type: abstract
    */
    public abstract String getClassName();

}
