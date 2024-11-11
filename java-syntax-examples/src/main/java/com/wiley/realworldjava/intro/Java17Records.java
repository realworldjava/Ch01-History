package com.wiley.realworldjava.intro;

public class Java17Records {

    record Coordinate(double x, double y) {}

    public static void main(String[] args) {

        Coordinate coord = new Coordinate(1.2, 5.9);
        System.out.println(coord.x());
        System.out.println(coord);
    }
}
