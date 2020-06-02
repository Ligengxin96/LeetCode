package ConvertBinaryNumberInALinkedListToInteger_1290;

import Utils.ListNode;

/**
 * @author : ligengxin
 * @version : V1.0
 * @packageName :  ConvertBinaryNumberInALinkedListToInteger_1290
 * @created : 2020/6/2
 * @description : https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 */
public class ConvertBinaryNumberInALinkedListToInteger {
    public static int getDecimalValue(ListNode head) {
        StringBuilder result = new StringBuilder();
        while(head != null) {
            result.append(head.val);
            head = head.next;
        }
        return Integer.valueOf(result.toString(), 2);
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 1};
        ListNode head = new ListNode(nums);
        System.out.printf( String.valueOf(getDecimalValue(head))); // 输出5
    }
}
