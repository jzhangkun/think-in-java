package polymorphism;

/**
 * Created by jack.zhang on 8/5/2016.
 */
class Glyph {
    void draw() { System.out.println("Glyph.draw()");}
    Glyph() {
        System.out.println("before Glyph.draw()");
        draw();
        System.out.println("after Glyph.draw()");
    }
}
class RoundGlyph extends Glyph {
    private int radius = 1;
    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }
    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}
public class PloyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
        // initialization sequences:
        // - start with RoundGlyph()
        // - Glyph()
        // - Glyph.draw()
        // - RoundGlyph().draw
        // - end with RoundGlyph()
    }
}
