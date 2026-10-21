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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int base=count/k;
        int rem=count%k;

        ListNode[] result=new ListNode[k];
        ListNode prev=null;
        temp=head;

        for(int i=0;i<k;i++){
            ListNode ans=temp;
            int size=base;

            if(rem>0){
                size++;
                rem--;
            }

            int j=0;
            while(j<size){
                prev=temp;
                temp=temp.next;
                j++;
            }

            if(prev!=null){
                prev.next=null;
            }
            result[i]=ans;
        }
        return result;

    }
}