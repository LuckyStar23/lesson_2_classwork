package com.company;

public  class Square extends Figure {
    private double side_length;

    public Square(double side_length) {
        this.side_length = side_length;
        this.setPerimeter(this.calculate_perimeter());

    }


    @Override
    public double calculate_perimeter() {
        return 4*side_length;
    }

    @Override
    public double calculate_area() {
        return side_length*side_length;
    }

    @Override
    public void info() {
        System.out.println( " Square side length: " +  side_length + Figure.unit + " " + "perimeter" + " "
                + getPerimeter()+ Figure.unit + " " + "area" + " " + calculate_area() + Figure.unit);
    }
}


