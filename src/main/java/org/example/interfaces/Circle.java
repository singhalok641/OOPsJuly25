package org.example.interfaces;

public class Circle extends Shape implements Drawable {
    @Override
    public void draw() {
        System.out.println("Draw a circle with it's specific" +
                "radius and position");
    }
}
