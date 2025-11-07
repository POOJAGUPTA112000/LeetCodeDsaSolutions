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
    public ListNode middleNode(ListNode head) {
        return findSize(head);
        
    }
   
    public ListNode findSize(ListNode head){
        int count=1;
        ListNode temp = head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        if(count%2==0){
            count= count/2;
        }else{
        count=(count/2)+1;
        }
        temp=head;
        while(count>1){
            temp=temp.next;
            count--;
        }
        return temp;
    }

}