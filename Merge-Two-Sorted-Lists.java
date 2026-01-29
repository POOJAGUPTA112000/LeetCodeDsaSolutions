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
13    ListNode list =new ListNode();
14    ListNode temp = list;
15    ListNode l1=list1;
16    ListNode l2=list2;
17    while(l1!=null && l2!=null){
18        if(l1.val<l2.val){
19            temp.next=l1;
20            l1=l1.next;
21        }else{
22            temp.next=l2;
23            l2=l2.next;
24        }
25        temp=temp.next;
26    }
27    if(l1!=null){
28        temp.next=l1;
29        temp=temp.next;
30    }
31    if(l2!=null){
32        temp.next=l2;
33        temp=temp.next;
34    }
35    return list.next;
36    }
37}