package com.company;

import java.util.Scanner;

public class q1Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        q1CircleWithException circle = new q1CircleWithException();
        Scanner input = new Scanner(System.in);
        System.out.println("Input radius of your circle: ");
        double radius=input.nextDouble();
        try{
            circle.setRadius(radius);
        }
        catch (IllegalArgumentException e){
            System.out.println("Radius invalid! Please input a positive radius!  ");
            return;
        }
        circle.getRadius();
        try {
            System.out.println("The Area of the circle is " + circle.getArea() + " when the radius is " + radius);
        }catch (Exception e){
            System.out.println("Area more than 1000!");
        }
    }
}
