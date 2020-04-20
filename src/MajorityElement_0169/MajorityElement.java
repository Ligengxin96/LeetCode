package MajorityElement_0169;

/**
 * @author : Mr.Li
 * @version : V1.0
 * @packageName :  MajorityElement_169
 * @created : 2020/4/20
 * @description : https://leetcode.com/problems/majority-element
 */
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int result = nums[0];
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            if(result == nums[i]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                result = nums[i];
                count = 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2}; // 输出2
        System.out.printf(String.valueOf(majorityElement(nums)));
    }
}
