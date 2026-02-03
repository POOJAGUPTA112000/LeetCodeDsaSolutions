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
12    public int getDecimalValue(ListNode head) {
13       StringBuilder str= new StringBuilder("");
14       ListNode temp=head;
15       while(temp!=null){
16        str.append(temp.val);
17        temp=temp.next;
18       }
19       return numToBin(str.toString());
20    }
21    public int numToBin(String s){
22        int val =0;
23        int n=0;
24        for( int i=s.length()-1;i>=0;i--){
25            if(s.charAt(i)=='1'){
26                val+=Math.pow(2,n);
27            }
28            n+=1;
29        }
30        return val;
31    }
32}