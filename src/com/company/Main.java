package com.company;

public class Main {

    public static void main(String[] args) {
        Square s1 = new Square(2.0);
        Square s2 = new Square(3.4);
        Rectangle r1 = new Rectangle(1.2, 2.3);
        Rectangle r2 = new Rectangle(3.3, 4.5);
        Rectangle r3 = new Rectangle(5.6, 6.7);

        Figure[] figure = {s1, s2, r1, r2, r3};
        for (int i = 0; i < figure.length; i++) {
            figure[i].info();

        }
    }
}





