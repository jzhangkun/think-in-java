package interfaces.ex9;
import polymorphism.music.Note;

/**
 * Created by jack.zhang on 8/5/2016.
 */

/*
interface Instrument {
    int VALUE= 5;
    void play(Note n);
    void adjust();
}
*/

abstract class Instrument {
    abstract void play(Note n);
    //abstract String toString();
    abstract void adjust();
}

class Wind extends Instrument {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
    public String toString() { return "Wind"; }
    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Percussion extends Instrument {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
    public String toString() { return "Percussion"; }
    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Stringed extends Instrument {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
    public String toString() { return "Stringed"; }
    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Brass extends Wind {
    public String toString() { return "Brass"; }
}

class Woodwind extends Wind {
    public String toString() { return "Woodwind"; }
}

public class Music5 {
    static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Instrument[] e) {
        for(Instrument i : e)
            tune(i);
    }
    public static void main(String[] args) {
        System.out.println("ex9.Music5");
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}
