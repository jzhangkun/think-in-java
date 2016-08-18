package tmp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by jack.zhang on 8/17/2016.
 */
public class testIterator {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        for(int i = 0; i < 5; i ++)
            nums.add(new Integer(i));
        Iterator<Integer> it = nums.iterator();
        while(it.hasNext()) {
            int i = it.next();
            System.out.println(i);
            it.remove();
        }
        System.out.println(nums);

    }
}
