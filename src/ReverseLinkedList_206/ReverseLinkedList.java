package ReverseLinkedList_206;

import Utils.ListNode;

/**
 * @author : ligengxin
 * @version : V1.0
 * @packageName :  ReverseLinkedList_206
 * @created : 2020/6/3
 * @description :
 */
public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {
        ListNode per = null;
        while(head != null){
            ListNode temp = head.next;
            head.next = per;
            per = head;
            head = temp;
        }
        return per;
    }

    // 递归法
    public static ListNode reverseList1(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode per = reverseList1(head.next);
        head.next.next = head;
        head.next = null;

        return per;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        ListNode head = new ListNode(nums);
        // 输出 5 4 3 2 1
//        System.out.printf(reverseList(head).toString());
        System.out.printf(reverseList1(head).toString());
    }

}
