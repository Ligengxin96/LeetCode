package MyPow_0050;

/**
 * @author : Mr.Li
 * @version : V1.0
 * @packageName :  MyPow_0050
 * @created : 2020/4/30
 * @description :
 */
public class MyPow {
    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }

        if (Math.abs(n) == 1) {
            return n > 0 ? x : 1 / x;
        }

        boolean isOdd = (n & 1) == 1;

        if (Math.abs(x) == 1) {
            if(isOdd) {
                return x;
            } else  {
                return Math.abs(x);
            }
        }

        double result = x;

        double temp = Math.abs(n) / 2;

        int half = (int) temp;

        for (int i = 1; i < half; i++) {
            result *= x;
        }

        if (isOdd) {
            result = x * result * result;
        } else {
            result = result * result;
        }

        return n > 0 ? result : 1 / result;
    }

    public static void main(String[] args) {
        double x = 8.95371;
        System.out.println(myPow(x, -1));
    }

}
