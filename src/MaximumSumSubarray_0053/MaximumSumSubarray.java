package MaximumSumSubarray_0053;

/**
 * @author : Mr.Li
 * @version : V1.0
 * @packageName :  MaximumSumSubarray_0053
 * @created : 2020/4/5
 * @description : https://leetcode.com/problems/maximum-subarray/
 */
public class MaximumSumSubarray {

    public static int maxSubArray (int[] nums) {
        int max = nums[0];
        int sum = 0;

        for(int i = 0; i < nums.length; i++) {
            sum = 0; // 每次 i 的值改变后 这里都需要吧sum 重置为0
            for(int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (max < sum) {
                    max = sum;
                }

            }
        }

        return max;
    }

    public static void main(String[] args) {
        //测试用例
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        //结果输出
        System.out.println(maxSubArray(nums));
    }
}
