package TwoSum_ii_InputArrayIsSorted_0167;

/**
 * @author : Mr.Li
 * @version : V1.0
 * @packageName :  TwoSum_ii_InputArrayIsSorted
 * @created : 2020/4/20
 * @description : https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 */
public class TwoSum_ii_InputArrayIsSorted {
    public static int[] twoSum(int[] numbers, int target) {
        int j = numbers.length - 1;
        for (int i = 0; i < j;) {
           if (numbers[i] + numbers[j] == target) {
               return new int[]{i + 1, j + 1};
           }
            if (numbers[i] + numbers[j] < target) {
                i++;
            }
            if (numbers[i] + numbers[j] > target) {
                j--;
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15}; // 输出[1, 2]
        int target = 9;
        int[] result = twoSum(nums, target);
        for (int i = 0; i < result.length; i ++) {
            System.out.println(result[i]);
        }
    }
}
