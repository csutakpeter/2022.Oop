package oop.labor02;


public class Rectangle {
    public double length;
    public double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    public double perimeter(){
        return length*2 + width*2;
    }
    public double area(){
        return length * width;
    }
}
