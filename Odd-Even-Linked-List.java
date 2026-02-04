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
12    public ListNode oddEvenList(ListNode head) {
13        if(head==null || head.next==null || head.next.next==null){
14            return head;
15        }
16        ListNode odd  = head;
17        ListNode even = head.next;
18
19        ListNode temp1 = odd;
20        ListNode temp2 = even;
21        while(temp1!=null && temp2!=null && temp1.next!=null && temp2.next!=null){
22            temp1.next=temp1.next.next;
23            temp2.next=temp2.next.next;
24            temp1=temp1.next;
25            temp2=temp2.next;
26        }
27        temp1.next=null;
28        // temp2.next=null;
29        head=odd;
30        while(odd.next!=null){
31            odd=odd.next;
32        }
33        odd.next=even;
34        return head;
35
36
37
38        
39    }
40}