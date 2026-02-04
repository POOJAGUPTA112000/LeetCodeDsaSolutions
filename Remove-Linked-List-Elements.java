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
12    public ListNode removeElements(ListNode head, int val) {
13        if(head==null){
14            return head;
15        }
16        ListNode prev=null;
17        ListNode curr=head;
18        while(curr!=null){
19            if(curr.val==val){
20                if(prev==null){
21                    head=head.next;
22                    curr=head;
23                }else{
24                    curr=curr.next;
25                    prev.next=curr;
26                    continue;
27               }
28            }else{
29                prev=curr;
30                curr=curr.next;
31            }
32            // prev=curr;
33            // curr=curr.next;
34        }
35        return head;
36    }
37}