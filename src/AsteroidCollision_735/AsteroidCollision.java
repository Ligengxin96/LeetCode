package AsteroidCollision_735;

import java.util.Stack;

/**
 * @author : Mr.Li
 * @version : V1.0
 * @packageName :  AsteroidCollision_735
 * @created : 2020/7/10
 * @description :
 */
public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack();
        for(int i = 0; i < asteroids.length; i++) {
            int e = asteroids[i];
            if (stack.size() == 0) {
                stack.push(e);
            } else {
                int top = stack.pop();
                if (top * e < 0 && e < top) { // 异号且前者是正数 后者是负数
                    if (Math.abs(top) < Math.abs(e)) {
                        i--;
                    } else if (Math.abs(top) > Math.abs(e)) {
                        stack.push(top);
                    }
                } else { // 同正或同负
                    stack.push(top);
                    stack.push(e);
                }
            }
        }
        int[] ary = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            ary[i] = stack.get(i);
        }
        return ary;
    }
}
