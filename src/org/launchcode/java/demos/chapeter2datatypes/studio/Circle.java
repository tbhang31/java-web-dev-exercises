package org.launchcode.java.demos.chapeter2datatypes.studio;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's calculate the area of a circle: \n\nWhat is the radius of your circle in cm?");
        double radius = input.nextDouble();
        while (radius < 0) {
            System.out.println("The radius can not be less than 0. Please enter a new radius");
            radius = input.nextDouble();
        }
        double area = Area.calculateArea(radius);
        System.out.println("The area of a circle with a radius of " +radius+"cm is " +area+" cm^2");
    }
}
