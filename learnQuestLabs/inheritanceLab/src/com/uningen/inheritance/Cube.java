package com.uningen.inheritance;

public class Cube extends Box {

    public Cube(double side){
        super(side);
    }

    @Override
    public void setLength(double length){
        if(length != super.getLength()){
            super.setLength(length);
            super.setHeight(length);
            super.setWidth(length);
        }
    }

    @Override
    public void setWidth(double width){
        if(width != super.getWidth()){
            super.setLength(width);
            super.setHeight(width);
            super.setWidth(width);
        }
    }

    @Override
    public void setHeight(double height){
        if(height != super.getHeight()){
            super.setLength(height);
            super.setHeight(height);
            super.setWidth(height);
        }
    }

    public void setSide(double side){
        if(side > 0){
            super.setLength(side);
            super.setHeight(side);
            super.setWidth(side);
        }
    }

    public double getSide(){
        return super.getHeight();
    }
}
