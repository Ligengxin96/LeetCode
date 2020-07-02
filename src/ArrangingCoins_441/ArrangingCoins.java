package ArrangingCoins_441;

/**
 * @author : Mr.Li
 * @version : V1.0
 * @packageName :  ArrangingCoins_441
 * @created : 2020/7/2
 * @description : https://leetcode.com/problems/arranging-coins/submissions/
 */
public class ArrangingCoins {
//    递归法(数字大的时候超时)
//    var arrangeCoins = function(n, k = 1) {
//        if (n - k === 0){
//            return k;
//        }
//        if (n - k < 0) {
//            return k - 1;
//        }
//        return arrangeCoins(n - k, ++k);
//    };
    // 本来准备定义一个count 变量来计数,发现 k 其实比count大1
    public int arrangeCoins(int n) {
        int k = 1;
        // int count = 0;
        while(n > 0) {
            n = n - k;
            k++;
            // count++;
        }
        // return n < 0 ? count - 1 : count;
        return n < 0 ? k - 2 : k - 1;
    }

    // 最简单的办法 等差数列公式 Sn=n(A1+An)/2
    // Sn = n(已知条件), n = k, A1 = 1, An = k(需要计算并返回的值)
    // 所以得到 n = k(k+1)/2 => k^2 + k - 2n = 0 => 求根公式....
}
