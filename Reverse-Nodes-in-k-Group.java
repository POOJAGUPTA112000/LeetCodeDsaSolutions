1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode reverseKGroup(ListNode head, int k) {
13        ListNode temp=head;
14        for( int i=0;i<k;i++){
15            if(temp==null){
16                return head;
17            }
18            temp=temp.next;
19        }
20        ListNode prev=null;
21        ListNode curr=head;
22        int count=0;
23        while(curr!=null && count<k){
24            ListNode fut=curr.next;
25            curr.next=prev;
26            prev=curr;
27            curr=fut;
28            count++;
29        }
30        head.next=reverseKGroup(curr,k);
31        return prev;
32    }
33}