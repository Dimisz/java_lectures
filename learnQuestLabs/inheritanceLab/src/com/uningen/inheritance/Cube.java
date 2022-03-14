package com.uningen.inheritance;

public class Cube extends Box {

    public Cube(double side){
        super(side);
    }

    @Override
    public void setLength(double length){
        if(length != super.getLength()){
            setSide(length);
        }
    }

    @Override
    public void setWidth(double width){
        if(width != super.getWidth()){
            setSide(width);
        }
    }

    @Override
    public void setHeight(double height){
        if(height != super.getHeight()){
            setSide(height);
        }
    }

    public void setSide(double side){
        if(side > 0){
            super.setLength(side);
            super.setHeight(side);
            super.setWidth(side);
        }
        else {
            System.out.println("The dimension specified is not greater than 0");
        }
    }

    public double getSide(){
        return super.getHeight();
    }
}
