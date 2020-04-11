package SingleNumber_136;

import java.util.Arrays;

/**
 * @author : Mr.Li
 * @version : V1.0
 * @packageName :  SingleNumber_136
 * @created : 2020/4/11
 * @description : https://leetcode.com/problems/single-number
 */
public class SingleNumber {
    // 骚操作是吧每个元素异或运算 两个相同的异或是0 然后最后的结果和0异或是结果
    public static int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1;) {
            if (nums[i] == nums[i + 1]) {
                i = i + 2;
            } else {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }

    public static void main(String[] args) {

//        int[] nums = {1,2,2,3,3}; // 输出 1
        int[] nums = {1,1,2,3,3}; // 输出 2
//        int[] nums = {1,1,2,2,3}; // 输出 3

        System.out.println(singleNumber(nums));
    }

}
