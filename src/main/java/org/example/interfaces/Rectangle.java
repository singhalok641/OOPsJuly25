package org.example.interfaces;

public class Rectangle implements Drawable{
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with it's width and height");
    }
}
