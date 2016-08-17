package holding.ex15;
import holding.Stack;
import java.util.List;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: jzhangkun
 * Date: 8/17/16
 * Time: 8:01 AM
 * To change this template use File | Settings | File Templates.
 */

public class CalExpression {
    private String expression;
    private static Stack<String> stack = new Stack<String>();
    public void setExp(String exp) {
        expression = exp;
    }
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        String exp = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---";
        //List<String> chars = new ArrayList<String>(exp.toCharArray());
        for(char e: exp.toCharArray()) {
            if(e == '+'){
                stack.push();
            }

        }
            System.out.println(e);

    }


}
