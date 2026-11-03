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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode temp=dummy;
        while(temp.next!=null && temp.next.next!=null){
            if(temp.next.val==temp.next.next.val){
                int duplicate=temp.next.val;

                while(temp.next!=null && temp.next.val==duplicate) {
                    temp.next=temp.next.next;
                }
            }
            else{
                temp=temp.next;
            }
        }
        return dummy.next;
    }
}