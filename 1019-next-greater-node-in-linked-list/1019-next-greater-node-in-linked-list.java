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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int[] arr=new int[count];
        int i=0;
        temp=head;
        while(temp!=null){
            arr[i]=temp.val;
            i++;
            temp=temp.next;
        }
        int[] a=new int[count];
        for(i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    a[i]=arr[j];
                    break;
                }
            }
        }
        return a;
    }
}