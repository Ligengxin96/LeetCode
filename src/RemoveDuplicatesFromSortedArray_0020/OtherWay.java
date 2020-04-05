package RemoveDuplicatesFromSortedArray_0020;

/**
 * 结果是对的
 */
public class OtherWay {

    private static int removeDuplicates(int[] nums) {

        int length = 0;

        if(nums.length > 0){
            length = 1;
        }

        for (int i  = 0 ,j = 0; j < nums.length ; j++) {
            if(nums[i] != nums[j]){
                length++;
                i = j ;
            }
        }
       return length;
    }

    public static void main(String[] args) {

        int[] nums = {1,1,2};

        System.out.println("数组元素个数:"+removeDuplicates(nums));

    }
}
