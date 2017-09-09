package typeinfo.ex3;

import java.util.Arrays;
import java.util.List;

/**
 * Created by jzhangkun on 21/05/2017.
 */
abstract class Shape {
    void draw() { System.out.println(this + ".draw()"); }
    abstract public String toString();
}

class Circle extends Shape {
    public String toString() { return "Circle"; };
}

class Square extends Shape {
    public String toString() { return "Square"; };
}

class Triangle extends Shape {
    public String toString() { return "Triangle"; };
}

class Rhomboid extends Shape {
    public String toString() { return "Rhomboid"; };
}

public class Shapes {
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
            new Circle(), new Square(), new Triangle()
        );
        for (Shape shape: shapeList)
            shape.draw();

        Shape ss = new Rhomboid();
        ss.draw();
        Object obj = null;
        if (ss instanceof Circle) {
            obj = (Circle) ss;
        } else if (ss instanceof Rhomboid) {
            obj = (Rhomboid) ss;
        }
        System.out.println(obj.getClass());
    }
}
