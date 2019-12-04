package Generics;

public class Point<E extends Number> {
    private E fieldX;
    private E fieldY;

    public Point(E fieldX, E fieldY){
        this.fieldX = fieldX;
        this.fieldY = fieldY;
    }

    public E getFieldX() {
        return fieldX;
    }

    public E getFieldY() {
        return fieldY;
    }
}