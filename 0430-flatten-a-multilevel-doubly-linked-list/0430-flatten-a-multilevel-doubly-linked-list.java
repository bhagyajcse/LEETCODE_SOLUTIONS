/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node temp=head;

        if(head==null){
            return head;
        }
        while(temp!=null){
            if(temp.child!=null){
                Node newn=temp.next;
                Node childHead=flatten(temp.child);
                temp.next=childHead;
                childHead.prev=temp;
                temp.child=null;

                Node curr=childHead;
                while (curr.next != null) {
                    curr=curr.next;
                }

                curr.next=newn;

                if (newn!=null) {
                    newn.prev =curr;
                }
            }

            temp=temp.next;
        }

        return head;
        
    }
}