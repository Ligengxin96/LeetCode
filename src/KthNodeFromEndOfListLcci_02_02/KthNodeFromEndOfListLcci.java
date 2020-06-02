package KthNodeFromEndOfListLcci_02_02;

import Utils.ListNode;

/**
 * @author : ligengxin
 * @version : V1.0
 * @packageName :  KthNodeFromEndOfListLcci_02_02
 * @created : 2020/6/2
 * @description :
 */
public class KthNodeFromEndOfListLcci {
    public static int kthToLast(ListNode head, int k) {
        // 快慢指针,让快指针先跑k次,然后慢指针在和快指针一起走
        // 如果快指针到头了,这个时候慢指针就是目标值
        ListNode fast = head;
        for(int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while(fast != null) {
            fast = fast.next;
            head = head.next;
        }

        return head.val;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k  = 2;
        ListNode head = new ListNode(nums);
        System.out.printf( String.valueOf(kthToLast(head, 2))); // 输出4
    }
}
