/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode temp = head;
        ListNode temp2 = dummy;

        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        temp = dummy;

        for (int i = 1; i < k; i++) {
            temp = temp.next;
        }

        for (int j = 1; j < count - k + 1; j++) {
            temp2 = temp2.next;
        }

        int x = temp.next.val;
        temp.next.val = temp2.next.val;
        temp2.next.val = x;

        return dummy.next;
    }
}
