package BestTimeToBuyAndSellStockⅡ_0122;

/**
 * @author : Mr.Li
 * @version : V1.0
 * @packageName :  BestTimeToBuyAndSellStockⅡ_0122
 * @created : 2020/4/10
 * @description : https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii
 */
public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        int totalProfit = 0;
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                if (prices[i] - min > 0) {
                    totalProfit +=  (prices[i] - min);
                    min = prices[i];
                }
            }
        }
        return totalProfit;
    }

    public static void main(String[] args) {

//        int[] nums = {7,1,5,3,6,4}; 输出 5
//        int[] nums = {1,9,9,9,9,9}; 输出 8
        int[] nums = {7,2,10,1,5,4}; // 最小值出现前 最大利润就出现了的测试用例 输出 12

        System.out.println(maxProfit(nums));
    }
}
