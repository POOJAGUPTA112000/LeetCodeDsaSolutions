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
12    public int[] nextLargerNodes(ListNode head) {
13       ArrayList<Integer> arr =new ArrayList<>();
14       ListNode temp= head;
15       while(temp!=null){
16        ListNode temp1=temp.next;
17        boolean f =false;
18        while(temp1!=null){
19            if(temp1.val>temp.val){
20                arr.add(temp1.val);
21                f=true;
22                break;
23            }
24            temp1=temp1.next;
25        }
26        if(f==false){
27            arr.add(0);
28        }
29        temp=temp.next;
30       }
31        int [] a = new int [arr.size()];
32        int i=0;
33        for( int k : arr){
34            a[i]=k;
35            i++;
36        }
37        return a;
38    }
39}