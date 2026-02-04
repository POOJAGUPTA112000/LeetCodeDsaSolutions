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
12    public ListNode deleteDuplicates(ListNode head) {
13        if(head==null){
14            return head;
15        }
16        ListNode prev=null;
17        ListNode curr=head;
18        while(curr!=null && curr.next!=null){
19            if(curr.val==curr.next.val){
20                int dval=curr.val;
21                while(curr!=null && dval==curr.val){
22                    curr=curr.next;
23                }
24                if(prev==null){
25                    head=curr;
26                    continue;
27                }else{
28                    prev.next=curr;
29                    continue;
30                }
31            }
32            prev=curr;
33            curr=curr.next;
34        }        
35        return head;
36    }
37}
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
80
81
82
83
84
85/**
86//  * Definition for singly-linked list.
87//  * public class ListNode {
88//  *     int val;
89//  *     ListNode next;
90//  *     ListNode() {}
91//  *     ListNode(int val) { this.val = val; }
92//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
93//  * }
94//  */
95// class Solution {
96//     public ListNode deleteDuplicates(ListNode head) {
97//         if(head==null){
98//             return  head;
99//         }
100//         ListNode prev=null;
101//         ListNode pres=head;
102//         ListNode fut= null;
103//         while(pres!=null){
104//             fut=pres.next;
105//             if(pres.val==fut.val){
106//                 if(prev==null){//head is dulicated
107//                 head=fut.next;
108//                 pres=head;
109//                 continue;
110//                 }else{
111//                     if(fut.next!=null){
112//                    prev.next=fut.next; 
113//                    pres=fut.next;
114//                    continue;
115//                     }else{
116//                         prev.next=null;
117//                         continue;
118//                     }
119//                 }
120//             }
121//             prev=pres;
122//             pres=pres.next;
123//         }
124//         return head;
125//     }
126// }