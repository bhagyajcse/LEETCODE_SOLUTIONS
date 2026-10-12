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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        
        int diff=count-n;
        if(diff==0){
            return head.next;
        }
        int i=0;
        ListNode temp1=head;
        while(i<diff-1){   
            temp1=temp1.next;
            i++;
        }
        temp1.next=temp1.next.next;
        return head;
    }
}