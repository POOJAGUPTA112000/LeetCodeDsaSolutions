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
12    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
13        ListNode list = new ListNode();
14        ListNode temp =list;
15        ListNode head1 = list1;
16        ListNode head2 = list2;
17        while(head1!=null && head2!=null){
18            if(head1.val<=head2.val){
19                temp.next = head1;
20                head1 = head1.next;
21            }else{
22                temp.next = head2;
23                head2 = head2.next;
24            }
25            temp=temp.next;
26        }
27        if(head1!=null){
28            temp.next=head1;
29        }
30        if(head2!=null){
31            temp.next=head2;
32        }
33        return list.next;
34    }
35}