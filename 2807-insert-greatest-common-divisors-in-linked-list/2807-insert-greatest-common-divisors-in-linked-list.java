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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null || head.next==null)
            return head;

        ListNode temp=head;
        
        while(temp!=null && temp.next!=null){
            int divisor=0;
            int dividend=0;
            if(temp.val<temp.next.val){
                divisor=temp.val;
                dividend=temp.next.val;
            }else{
                divisor=temp.next.val;
                dividend=temp.val;
            }
            int rem=0;
            do{
                rem=dividend%divisor;
                dividend=divisor;
                divisor=rem;
            }while(rem!=0);
            ListNode nextNode = temp.next;
            temp.next = new ListNode(dividend);
            temp.next.next = nextNode;
            temp = nextNode;
        }
        return head;
    }
}