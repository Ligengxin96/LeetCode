package MergeSortedArray_0088;

import java.util.Arrays;

/**
 * @author : Mr.Li
 * @version : V1.0
 * @packageName :  MergeSortedArray_0088
 * @created : 2020/4/6
 * @description : https://leetcode.com/problems/merge-sorted-array
 */
public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m, j = 0; j < n; i++, j++) {
            nums1[i] = nums2[j];
        }
        Arrays.sort(nums1);
//        for (int i = 0; i < nums1.length; i++) {
//            System.out.println(nums1[i]);
//        }
    }

    public static void main(String[] args) {
        //测试用例
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;

        //结果输出
        merge(nums1, m, nums2, n);
    }
}
