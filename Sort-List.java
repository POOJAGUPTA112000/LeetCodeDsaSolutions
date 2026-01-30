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
12    public ListNode sortList(ListNode head) {
13        if(head==null ||head.next==null){
14            return head;
15        }
16        ListNode mid=middle(head);
17        ListNode right=sortList(mid.next);
18        mid.next=null;
19        ListNode left=sortList(head);
20        
21        return mergeList(left,right);
22    }
23    public ListNode mergeList(ListNode left,ListNode right){
24        ListNode ll =new ListNode();
25        ListNode temp=ll;
26        while(left!=null && right!=null){
27            if(left.val<right.val){
28                temp.next=left;
29                left=left.next;
30            }else{
31                temp.next=right;
32                right=right.next;
33            }
34            temp=temp.next;
35        }
36        if(left!=null){
37            temp.next=left;
38        }
39        if(right!=null){
40            temp.next=right;
41        }
42        return ll.next;
43    }
44    public ListNode middle(ListNode node){
45        if(node==null){
46            return null;
47        }
48        ListNode slow=node;
49        ListNode fast=node;
50        while(fast.next!=null && fast.next.next!=null){
51            slow=slow.next;
52            fast=fast.next.next;
53        }
54        return slow;
55    }
56}