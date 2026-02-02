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
12    public boolean isPalindrome(ListNode head) {
13        if(head==null){
14            return true;
15        }
16        ListNode fast=head;
17        ListNode slow=head;
18        ListNode prev=null;
19        // ListNode temp=head;
20        while(fast!=null && fast.next!=null){
21            fast=fast.next.next;
22            prev=slow;
23            slow=slow.next;
24        }
25        // ListNode mid=slow;
26        ListNode a=null; //prev
27        ListNode b=slow;//curr
28        ListNode c=null;//fut
29        while(b!=null){
30            c=b.next;
31            b.next=a;
32            a=b;
33            b=c;
34        }
35        // prev.next=b;
36        while(a!=null){
37            if(head.val!=a.val){
38                return false;
39            }
40            head=head.next;
41            a=a.next;
42        }
43        return true;
44    }
45}
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
61
62
63
64
65
66
67
68
69
70
71
72
73
74
75
76
77
78
79
80/**
81//  * Definition for singly-linked list.
82//  * public class ListNode {
83//  *     int val;
84//  *     ListNode next;
85//  *     ListNode() {}
86//  *     ListNode(int val) { this.val = val; }
87//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
88//  * }
89//  */
90// class Solution {
91//     public boolean isPalindrome(ListNode head) {
92//         ListNode temp=head;
93//         Stack<Integer> st= new Stack<>();
94//         while(temp!=null){
95//             st.push(temp.val);
96//             temp=temp.next;
97//         }
98//         temp=head;
99//         while(temp!=null){
100//             if(st.peek()==temp.val){
101//                 st.pop();
102//             }
103//             temp=temp.next;
104//         }
105//         if(st.empty()){
106//             return true;
107//         }
108//         return false;
109//     }
110// }