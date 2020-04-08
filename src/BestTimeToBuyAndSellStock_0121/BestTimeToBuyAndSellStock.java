package BestTimeToBuyAndSellStock_0121;

/**
 * @author : Mr.Li
 * @version : V1.0
 * @packageName :  BestTimeToBuyAndSellStock_0121
 * @created : 2020/4/8
 * @description : https://leetcode.com/problems/best-time-to-buy-and-sell-stock
 */
public class BestTimeToBuyAndSellStock {
    // 暴力解 当然并不满足暴力的方法 看下面只遍历一遍的方法
//    public static int maxProfit(int[] prices) {
//        int max = 0;
//        int buy = 0;
//        int sell = 0;
//
//        for (int i = 0; i < prices.length; i++) {
//            buy = prices[i];
//            for (int j = i + 1; j < prices.length; j++) {
//                sell = prices[j];
//                if (sell - buy > max) {
//                    max = sell - buy;
//                }
//            }
//        }
//
//        return max;
//    }


    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]; // 在遍历的时候找到最小的那个 然后计算 后面的和最小的差值(最大利润)
            } else {
                if (maxProfit < prices[i] - minPrice) { // 当然 可能最小值出现前 最大利润就出现了,所以 我们还需要判断下最大利润
                    maxProfit = prices[i] - minPrice;
                }
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

//        int[] nums = {7,1,5,3,6,4}; 输出 5
        int[] nums = {7,2,10,1,5,4}; // 最小值出现前 最大利润就出现了的测试用例 输出 8

        System.out.println(maxProfit(nums));
    }
}
