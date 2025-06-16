package Entities;

import javax.xml.namespace.QName;

public class Rectangle {

    public double width;
    public double height;

    public double Area(){
        return width * height;
    };

    public double Perimeter() {
        return 2 * (width + height);
    };

    public double Diagonal() {
    return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    };

    public String toString() {
       return "Rectangle: \n"
               + "width = " + String.format("%.2f" , width) + "\n"
               + "height = " + String.format("%.2f", height) + "\n"
               + "Area = " + String.format("%.2f", Area()) + "\n"
               + "Perimeter = " + String.format("%.2f", Perimeter()) + "\n"
               + "Diagonal = " + String.format("%.2f",  Diagonal());
    };

}
