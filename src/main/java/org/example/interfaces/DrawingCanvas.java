package org.example.interfaces;

public class DrawingCanvas {
    public void render(Drawable shape) {
        System.out.println("Preparing to render a " + Drawable.MEDIA_TYPE);

        // calls the correct draw() method based on the object's actual type
        shape.draw();
    }

    public static void main(String[] args) {
        DrawingCanvas canvas = new DrawingCanvas();
        Drawable myCircle = new Circle();
        Drawable myRectangle = new Rectangle();

        canvas.render(myCircle); // Renders the circle
        canvas.render(myRectangle); // Renders the rectangle

        Shape shape = new Circle();
        shape = new Rectangle();
        Drawable rectangle = new Rectangle();
        drawShape(rectangle);
    }

    public static void drawShape(Drawable drawable){
        drawable.draw();
    }
}
