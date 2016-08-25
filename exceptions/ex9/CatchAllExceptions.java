package exceptions.ex9;

/**
 * Created by jack.zhang on 8/23/2016.
 */
class MyException1 extends Exception {

}
class MyException2 extends Exception {

}
class MyException3 extends Exception {

}
public class CatchAllExceptions {
    public static void throwExceptions() throws MyException1, MyException2, MyException3 {
        //throw new MyException1();
        throw new MyException2();
        //throw new MyException3();
    }
    public static void main(String[] args) {
        try {
            throwExceptions();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
