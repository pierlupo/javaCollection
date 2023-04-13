package org.example.designPattern.bridge;

public abstract class House {

    protected Construction construction;

    public House(Construction construction){
        this.construction = construction;
    }

    public abstract void build();
}
