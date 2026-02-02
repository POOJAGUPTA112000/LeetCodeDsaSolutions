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
12    public ListNode reverseBetween(ListNode head, int left, int right) {
13        if(head==null || left==right){
14            return head;
15        }
16        ListNode h1;
17        ListNode h2;
18        ListNode prev=null;
19        ListNode pres=head;
20        ListNode fut=null;
21        for( int i=1;i<left;i++){
22            prev=pres;
23            pres=pres.next;
24        }
25        h1=prev;
26        h2=pres;
27        for( int i=0;i<=right-left;i++){
28            fut=pres.next;
29            pres.next=prev;
30            prev=pres;
31            pres=fut;
32        }
33        if(h1!=null){
34            h1.next=prev;
35        }else{
36            head=prev;
37        }
38        h2.next=pres;
39        return head;
40    }
41}