/*
Program Name: Assignment_2_1
Author: Brianna Drew
Student No.: 0622446
Date Created: 02/21/2019
Last Modified: 02/26/2019
*/

// import required java library
import java.lang.System;

/*
Class: Test
Description: This class will create an array of 5 shapes, then create a different shape in each position of the array (Circle, Equilateral
             Triangle, Triangle, Rectangle, and Square). It will then print the perimeter and area of each shape.
*/
class Test {

    /*
    Method: main
    Description: The primary method of the program. This first creates an array to fit 5 objects of class GeometricObject. It then creates 5
                 objects of subclasses of GeometricObject. 1st is an object of Circle class with default values (no parameters), 2nd is an
                 object of EquilateralTriangle class with 5.0 for each side, 3rd is an object of Triangle class with default values (no
                 parameters), 4th is an object of Rectangle class with default values (no parameters), and the 5th is an object of Square
                 class with 5.0 for each side. It then utilizes a foreach loop to go through each object in the array to pass it the method
                 printAreaAndPerimeter() to print the object's area and perimeter.
    Usage: primary method in class FibonacciNumbers
    Parameters: String args[]
    Return Type: void
    */
    public static void main(String[] args){

        GeometricObject gObjectArray [] = new GeometricObject [5]; // create new array to store up to 5 GeometricObjects
        gObjectArray[0] = new Circle(); // create new Circle object with default values and store it in the 1st position in the array.
        gObjectArray[1] = new EquilateralTriangle(5.0); // create new EquilateralTriangle object with 5.0 for each side and store it in the 2nd position in the array.
        gObjectArray[2] = new Triangle(); // create new Triangle object with default values and store it in the 3rd position in the array.
        gObjectArray[3] = new Rectangle(); // create new Rectangle object with default values and store it in the 4th position in the array.
        gObjectArray[4] = new Square(5.0); // // create new Square object with 5.0 for each side and store it in the 5th position in the array.

        for (GeometricObject shape : gObjectArray) { // foreach loop that goes through each object (shape) in the gObjectArray one at a time

            printAreaAndPerimeter(shape); // pass the current shape to the printAreaAndPerimeter method to print the area and perimeter of the shape

        }
    }

    /*
    Method: printAreaAndPerimeter
    Description: Gets area, perimeter and name of shape (class) for the passed object from gObjectArray, and prints them
    Usage: called in main method
    Parameters: Object gObject of GeometricObject class (passed from array of GeometricObject objects, gObjectArray)
    Return Type: void
    */
    private static void printAreaAndPerimeter(GeometricObject gObject){

            double area = gObject.getArea(); // get the area of the object
            double perimeter = gObject.getPerimeter(); // get the perimeter of the object
            String className = gObject.getClassName(); // get the name of the shape of the object

            System.out.println();
            System.out.println(className + ":"); // print name of class (just to organize the output)
            System.out.println("Area: " + area + " Perimeter: " + perimeter); // print area and perimeter of object

        }

    }
