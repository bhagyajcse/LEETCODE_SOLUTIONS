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
    public ListNode partition(ListNode head, int x) {
        ListNode temp=head;
        ListNode d1=new ListNode(0);
        ListNode t1=d1;
        ListNode d2=new ListNode(0);
        ListNode t2=d2;

        while(temp!=null){
            if(temp.val<x){
                t1.next=new ListNode(temp.val);
                t1=t1.next;
            }else{
                t2.next=new ListNode(temp.val);
                t2=t2.next;
            }
            temp=temp.next;
        }
        while(t1.next!=null){
            t1=t1.next;
        }
        t1.next=d2.next;
        return d1.next;
    }
}