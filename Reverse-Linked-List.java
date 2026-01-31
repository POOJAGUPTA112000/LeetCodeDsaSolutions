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
12    ListNode temp;
13    ListNode tail;
14    public ListNode reverseList(ListNode head) {
15      if(head==null){
16        return head;
17      }
18      reverseall(head);
19      head=temp;
20      return head;
21    }
22    public void reverseall(ListNode node){
23            if(node.next==null){
24                temp=node;
25                tail=node;
26                tail.next=null;
27                return;
28            }
29            reverseall(node.next);
30            tail.next=node;
31            tail=node;
32            tail.next=null;
33    }
34}
35
36
37
38
39
40
41
42/**
43//  * Definition for singly-linked list.
44//  * public class ListNode {
45//  *     int val;
46//  *     ListNode next;
47//  *     ListNode() {}
48//  *     ListNode(int val) { this.val = val; }
49//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
50//  * }
51//  */
52// class Solution {
53//     ListNode temp;
54//     ListNode tail;
55//     public ListNode reverseList(ListNode head) {
56//         if(head==null){
57//             return head;
58//         }
59//         reverseall(head);
60//         head=temp;
61//         return head;
62//     }
63//     public void reverseall(ListNode node){
64//         if(node.next==null){
65//             temp=node;
66//             tail=node;
67//             return ;
68//         }
69//         reverseall(node.next);
70//         tail.next=node;
71//         tail=node;
72//         tail.next=null;
73//     }
74
75// }