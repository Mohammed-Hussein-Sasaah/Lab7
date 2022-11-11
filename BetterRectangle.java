/*10. The java.awt.Rectangle class of the standard Java library does not supply a
method to compute the area or perimeter of a rectangle. Provide a subclass
BetterRectangle of the Rectangle class that has getPerimeter and getArea
methods. Do not add any instance variables. In the constructor, call the
setLocation and setSize methods of the Rectangle class. Provide a program
that tests the methods that you supplied.*/


import java.awt.*;
public class BetterRectangle extends Rectangle {
    public BetterRectangle(int z , int b ,int width,int height)
    {
        super(z , b , width , height);
        setLocation(z,b);
        setSize(width,height);
    }
    public double getPerimeter()
    {
        double Perimeter = 2 * (super.getHeight() + super.getWidth());
        return  Perimeter;
    }
    public double getArea()
    {
        double area = super.getHeight() * super.getWidth();
        return area;
    }
}