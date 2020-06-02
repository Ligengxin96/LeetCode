package RemoveLlinkedListElements_0203;

import Utils.ListNode;

import java.util.WeakHashMap;

/**
 * @author : ligengxin
 * @version : V1.0
 * @packageName :  RemoveLlinkedListElements_0203
 * @created : 2020/6/1
 * @description : https://leetcode.com/problems/remove-linked-list-elements/
 */
public class RemoveLlinkedListElements {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode virtualHead = new ListNode(-1);
        virtualHead.next = head;
        ListNode perNode = virtualHead;
        while(perNode != null && perNode.next != null) {
            if (perNode.next.val == val) {
                perNode.next = perNode.next.next;
            } else {
                perNode = perNode.next;
            }
        }
        return virtualHead.next;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,6,3,4,5,6};
        int val = 6;
        ListNode head = new ListNode(nums);
        System.out.printf(removeElements(head, val).toString());
    }
}