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
    public ListNode doubleIt(ListNode head) {
        ListNode temp=head;
        ListNode prev=null;
        
        while(temp!=null){
            ListNode next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }

        ListNode dummy=new ListNode(0);
        ListNode t=dummy;
        
        int sum=0;
        int carry=0;
        while(prev!=null){
            int val=prev.val;
            sum=val+val+carry;
            carry=sum/10;
            sum=sum%10;
            t.next=new ListNode(sum);
            t=t.next;
            prev=prev.next;
        }
        if(carry>0){
            t.next=new ListNode(carry);
        }
        temp=dummy.next;
        prev=null;
        while(temp!=null){
            ListNode next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;
    }
}