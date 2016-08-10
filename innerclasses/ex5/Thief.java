package innerclasses.ex5;

/**
 * Created by jack.zhang on 8/9/2016.
 */
class Store {
    public class Treasure {
        private String s = "Boomb";
        public void f() { System.out.println(s); }
    }
}
public class Thief {
    public static void main(String[] args) {
        Store store = new Store();
        Store.Treasure treasure = store.new Treasure();
        treasure.f();
    }
}
