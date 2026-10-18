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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode t1=list1;
        ListNode t2=list1;
        ListNode t3=list2;
        for(int i=1;i<a;i++){
            t1=t1.next;
        }
        for(int i=1;i<b+1;i++){
            t2=t2.next;
        }
        t1.next=list2;
        ListNode next=t2.next;
        while(t3.next!=null){
            t3=t3.next;
        }
        t3.next=next;
        return list1;
    }
}