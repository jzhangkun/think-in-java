package typeinfo.ex5;

import java.util.Arrays;
import java.util.List;

/**
 * Created by jzhangkun on 21/05/2017.
 */
abstract class Shape {
    void draw() { System.out.println(this + ".draw()"); }
    abstract public String toString();
    void rotate() {
        String cname = this.getClass().getSimpleName();
        if (this instanceof Circle) {
            System.out.println(cname + " Not Rotate");
        } else {
            System.out.println("Rotate " + cname);
        }

    }
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

public class Shapes {
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
            new Circle(), new Square(), new Triangle()
        );
        for (Shape shape: shapeList)
            shape.draw();
        for (Shape shape: shapeList)
            shape.rotate();
    }
}
