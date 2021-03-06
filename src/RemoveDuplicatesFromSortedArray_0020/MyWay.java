package RemoveDuplicatesFromSortedArray_0020;

/**
 * 26. Remove Duplicates from Sorted Array
 *
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * Example 1:
 *
 * Given nums = [1,1,2],
 *
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 *
 * It doesn't matter what you leave beyond the returned length.
 * Example 2:
 *
 * Given nums = [0,0,1,1,1,2,2,3,3,4],
 *
 * Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.
 *
 * It doesn't matter what values are set beyond the returned length.
 * Clarification:
 *
 * Confused why the returned value is an integer but your answer is an array?
 *
 * Note that the input array is passed in by reference, which means modification to the input array will be known to the caller as well.
 *
 * Internally you can think of this:
 *
 * // nums is passed in by reference. (i.e., without making a copy)
 * int len = removeDuplicates(nums);
 *
 * // any modification to nums in your function would be known by the caller.
 * // using the length returned by your function, it prints the first len elements.
 * for (int i = 0; i < len; i++) {
 *     print(nums[i]);
 * }
 */
public class MyWay {

    private static int removeDuplicates(int[] nums) {
        //计数器
        int count = 0;

        //每一个元素和后面所有不等于-1的元素比较
        for (int i = 0; (i != -1) && (i <nums.length) ; i++) {
            int before =  nums[i];
            for (int j = i+1; (j != -1) && j<nums.length; j++) {
                int after = nums[j];
                if(before == after){
                    //相同的就把后面的设为-1
                    nums[j] = -1;
                }
            }
        }

        //统计-1的个数
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i] == -1){
                count++;
            }
        }

        //找出原数组非-1的元素
        int[] newNums = new int[nums.length-count];
        int j = 0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i] != -1){
                newNums[j++] = nums[i];
            }
        }

        //打印组成元素
        for (int i = 0; i <count ; i++) {
            System.out.println("数组组成元素:"+newNums[i]);
        }

        //返回非-1的元素个数
        return nums.length-count;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println("数组元素个数:"+removeDuplicates(nums));

    }
}
