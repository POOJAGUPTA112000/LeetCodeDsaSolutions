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
12    public ListNode middleNode(ListNode head) {
13        if(head==null){
14            return head;
15        }
16        ListNode slow=head;
17        ListNode fast=head;
18        while(fast!=null && fast.next!=null){
19            fast=fast.next.next;
20            slow=slow.next;
21        }
22        return slow;
23    }
24}
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
57
58
59
60
61/**
62//  * Definition for singly-linked list.
63//  * public class ListNode {
64//  *     int val;
65//  *     ListNode next;
66//  *     ListNode() {}
67//  *     ListNode(int val) { this.val = val; }
68//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
69//  * }
70//  */
71// class Solution {
72//     public ListNode middleNode(ListNode head) {
73//         return findSize(head);
74        
75//     }
76   
77//     public ListNode findSize(ListNode head){
78//         int count=1;
79//         ListNode temp = head;
80//         while(temp!=null){
81//             temp=temp.next;
82//             count++;
83//         }
84//         if(count%2==0){
85//             count= count/2;
86//         }else{
87//         count=(count/2)+1;
88//         }
89//         temp=head;
90//         while(count>1){
91//             temp=temp.next;
92//             count--;
93//         }
94//         return temp;
95//     }
96
97// }