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
    public int pairSum(ListNode head) {
        ListNode temp=head;
        int count=0;

        while(temp!=null){
            count++;
            temp=temp.next;
        }

        temp=head;
        int arr[]=new int[count];
        for(int i=0;i<arr.length;i++){
            arr[i]=temp.val;
            temp=temp.next;
        }

        int i=0;
        int j=arr.length-1;
        int max=0;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(max<sum){
                max=sum;
            }
            i++;
            j--;
        }
        return max;
    }
}