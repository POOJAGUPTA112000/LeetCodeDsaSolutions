1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode detectCycle(ListNode head) {
14        if(head==null){
15            return null;
16        }
17        ListNode fast=head;
18        ListNode slow=head;
19        while(fast!=null && fast.next!=null){
20            fast=fast.next.next;
21            slow=slow.next;
22            if(slow==fast){
23                // int count=0;
24                slow=head;
25                while(fast!=slow){
26                    // if(fast==slow){
27                    //     return slow;
28                    // }
29                    fast=fast.next;
30                    slow=slow.next;
31                }
32                return slow;
33                // return slow;
34            }
35        }
36        return null;
37    }
38}