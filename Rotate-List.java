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
12    public ListNode rotateRight(ListNode head, int k) {
13        if(head==null || k==0 || head.next==null){
14            return head;
15        }
16        ListNode temp=head;
17        int count=0;
18        while(temp!=null){
19            temp=temp.next;
20            count++;
21        }
22        if(count==k ){
23            return head;
24        }
25
26        while(k>count){
27        k=k%count;
28       }
29        while(k!=0){
30            ListNode prev=null;
31            ListNode curr=head;
32            while(curr.next!=null){
33                prev=curr;
34                curr=curr.next;
35            }
36            prev.next=null;
37            curr.next=head;
38            head=curr;
39            k-=1;
40        }
41        return head;
42    }
43}