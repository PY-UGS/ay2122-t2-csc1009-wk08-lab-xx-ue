package com.company;

public class q1CircleWithException {
    final static double PI=3.14159265359;
    private double radius;
    private double area;
    private double diameter;

    public double getRadius(){
        return radius;
    }
    public void setRadius (double radius)throws IllegalArgumentException{
        if (radius<=0){
            throw new IllegalArgumentException();

        }
        else{
        this.radius= radius;
    }}
    public double getArea() throws Exception {
        area=PI*this.radius*this.radius;
        if(area>1000) {
            throw new Exception("Area more than 1000!");
        }
        else{
        return area;
        //////////////////
    }}
    public double getDiameter(){
        diameter=this.radius*2;
        return diameter;
    }


}
