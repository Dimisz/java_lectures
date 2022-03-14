package com.uningen.inheritance;

public class Box {
    private double height;
    private double width;
    private double length;

    public Box(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public Box(double side){
        this.height = side;
        this.width = side;
        this.length = side;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getVolume(){
        return height * width * length;
    }

    public void printBox(){
        if((length <= 0) || (height <= 0) || (width <= 0)){
            System.out.println("The box contains invalid property");
        }
        else {
            System.out.println("Height: " + Double.toString(height));
            System.out.println("Width: " + Double.toString(width));
            System.out.println("Length: " + Double.toString(length));
            System.out.println("Volume: " + Double.toString(getVolume()));



        }
    }
}
