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
        Stack<Character> stack = new Stack<Character>();
        String exp = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---";
        //List<String> chars = new ArrayList<String>(exp.toCharArray());
        char[] ch = exp.toCharArray();
        System.out.println(ch);
        for(int i  = 0; i < ch.length; i++) {
            if (ch[i] == '+') {
                i++;
                stack.push(ch[i]);
                System.out.println("push " + ch[i]);
            }
            else if(ch[i] == '-') {
                char c = stack.pop();
                System.out.println("pop " + c);

            }
        }
    }


}
