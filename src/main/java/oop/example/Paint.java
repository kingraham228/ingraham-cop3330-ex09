package oop.example;

import java.util.Scanner;

public class Paint {
    private final int gallonCoverageFeet = 350;
    private double length;
    private double width;
    private double area;
    private int gallonsNeeded;

    public void setLength() {
        Scanner input = new Scanner(System.in);
        do {

            System.out.println("What is the length of the room in feet? ");
            while (!input.hasNextDouble()) {
                String str1 = input.next();
                System.out.println(str1 + " is not a valid length.");
            }
            length = input.nextDouble();
        } while (length < 0);


    }

    public void setWidth() {
        Scanner input = new Scanner(System.in);
        do {

            System.out.println("What is the width of the room in feet? ");
            while (!input.hasNextDouble()) {
                String str2 = input.next();
                System.out.println(str2 + " is not a valid width.");
            }
            width = input.nextDouble();
        } while (width < 0);

    }

    public double findArea(){
        area = length * width;
        return area;
    }

    public int getGallons() {
        double gallons = area / gallonCoverageFeet;
        int gallonFactor = (int) (area % gallonCoverageFeet);

        if (gallonFactor == 0) {
            gallonsNeeded = (int) gallons;
            return gallonsNeeded;
        }

        gallons = gallons +1;
        gallonsNeeded = (int) gallons;
        return gallonsNeeded;
    }
}
