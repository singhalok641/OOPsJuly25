package org.example.interfaces;

public class Rectangle extends Shape implements Drawable, Swimmable{
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with it's width and height");
    }
}
