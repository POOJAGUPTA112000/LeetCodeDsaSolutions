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
13        return findSize(head);
14        
15    }
16   
17    public ListNode findSize(ListNode head){
18        int count=1;
19        ListNode temp = head;
20        while(temp!=null){
21            temp=temp.next;
22            count++;
23        }
24        if(count%2==0){
25            count= count/2;
26        }else{
27        count=(count/2)+1;
28        }
29        temp=head;
30        while(count>1){
31            temp=temp.next;
32            count--;
33        }
34        return temp;
35    }
36
37}