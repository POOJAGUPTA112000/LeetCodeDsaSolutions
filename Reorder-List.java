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
12    public void reorderList(ListNode head) {
13        // if(head==null){
14        //     return head;
15        // }
16        ListNode fast=head;
17        ListNode slow=head;
18        while(fast!=null && fast.next!=null){
19            fast=fast.next.next;
20            slow=slow.next;
21        }
22        ListNode pre=null;
23        ListNode curr=slow.next;
24        ListNode fut=null;
25        slow.next=null;
26        while(curr!=null){
27            fut=curr.next;
28            curr.next=pre;
29            pre=curr;
30            curr=fut;
31        }
32        ListNode h1;
33        ListNode h2;
34        ListNode temp=head;
35        while(pre!=null){
36           h1=temp.next;
37           h2=pre.next;
38           temp.next=pre;
39           pre.next=h1;
40           temp=h1;
41           pre=h2;
42        }
43        // return head;
44    }
45}