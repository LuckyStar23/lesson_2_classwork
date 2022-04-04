package com.company;

public class Rectangle extends Figure{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        this.setPerimeter(calculate_perimeter());
    }


    @Override
    public double calculate_perimeter() {
        double perimeterRec;
        perimeterRec = (length*width) *2;
        return perimeterRec;
    }

    @Override
    public double calculate_area() {
        double areaRec;
        areaRec = length*width;
        return areaRec ;
    }

    @Override
    public void info() {
        System.out.println("Rectangle length:" + " "+ length + Figure.unit + " " + "Rectangle width: " + " "
                + width + Figure.unit + " " + "perimeter" + " "
                + getPerimeter() + Figure.unit + " " + "area" + " " + calculate_area() + Figure.unit);
    }
}
