package org.example.v2;

public abstract class Beverage {
    String description = "unknow Beverage";

    public enum Size { TALL, GRANDE, VENTI };
    Size size = Size.TALL;


    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

    public String getDescription() {
        return description;
    }


    public abstract double cost();
}

