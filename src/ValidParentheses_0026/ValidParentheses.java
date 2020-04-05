package ValidParentheses_0026;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 *  20. Valid Parentheses
 *  url=https://leetcode.com/problems/valid-parentheses/description
 *
 *  Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 *  An input string is valid if:
 *
 *  Open brackets must be closed by the same type of brackets.
 *  Open brackets must be closed in the correct order.
 *  Note that an empty string is also considered valid.
 *
 *  Example 1:
 *
 *  Input: "()"
 *  Output: true
 *  Example 2:
 *
 *  Input: "()[]{}"
 *  Output: true
 *  Example 3:
 *
 *  Input: "(]"
 *  Output: false
 *  Example 4:
 *
 *  Input: "([)]"
 *  Output: false
 *  Example 5:
 *
 *  Input: "{[]}"
 *  Output: true
 *
 */

/**Result:
 * Runtime: 3 ms, faster than 50.72% of Java online submissions for Valid Parentheses.
 * Memory Usage: 33.2 MB, less than 100.00% of Java online submissions for Valid Parentheses.
 */
public class ValidParentheses {

    static Map<Character,Character> map = new HashMap<>();

    public static boolean check(String symbol){

        //长度为0
        if(symbol.length() == 0) {
            return true;
        }

        //长度为奇数
        if(symbol.length()%2 != 0){
            return false;
        }

        //第一个是右括号或者最后个是左括号
        if(map.values().contains(symbol.charAt(0)) || map.keySet().contains(symbol.charAt(symbol.length()-1))){
            return false;
        }

        Stack<Character> stack = new Stack();

        for (int i = 0; i < symbol.length(); i++) {
            if(map.keySet().contains(symbol.charAt(i))){
                //进来的肯定是左括号了,入栈
                stack.push(symbol.charAt(i));
            }else {
                //第一个肯定是有元素的,如果比对过程中,栈提前为空,说明右括号多了
                if(stack.isEmpty()){
                    return false;
                }
                //进来的右括号,跟栈顶元素配对,配对成功出栈,否则发现不匹配的括号返回false
                if(map.get(stack.peek()) == (symbol.charAt(i))){
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        //return stack.isEmpty();这样写或许更方便,但是防止自己看不懂
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');

        //测试用例
        String symbol = "(){}[(]){}{}{}{}{}{{{{{}{}][][][][{{{(()){}}";

        //结果输出
        System.out.println(check(symbol));
    }
}
