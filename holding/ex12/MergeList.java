package holding.ex12;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by jack.zhang on 8/16/2016.
 */
public class MergeList {
    public static void main(String[] args) {
        List<Integer> A = new ArrayList<Integer>();
        for(int i = 0; i < 5; i++)
            A.add(new Integer(i));

        List<Integer> B = new ArrayList<Integer>();
        for(int i = 0; i < 5; i++)
            B.add(new Integer(i));

        ListIterator lia = A.listIterator(5);
        while(lia.hasPrevious())
            B.add((Integer)(lia.previous()));
        System.out.println(B);
    }
}
