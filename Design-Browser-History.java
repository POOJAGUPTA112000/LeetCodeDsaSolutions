1class BrowserHistory {
2    public class Node {
3        String url;
4        Node prev;
5        Node next;
6        public Node (String url){
7            this.url=url;
8            this.prev=null;
9            this.prev=null;
10        }
11    }
12    Node curr;
13    public BrowserHistory(String homepage) {
14        Node node = new Node (homepage);
15        curr=node;
16    }
17
18    public void visit(String url){
19       Node node =new Node (url);
20       curr.next=node;
21       node.prev=curr;
22       curr=node;
23    }
24    
25    public String back(int step) {
26        while(curr.prev!=null && step > 0){
27            step--;
28            curr=curr.prev;
29        }
30        return curr.url;
31    }
32    
33    public String forward(int step) {
34        while(curr.next!=null && step > 0){
35            step--;
36            curr=curr.next;
37        }
38        return curr.url;
39    }
40}
41
42/**
43 * Your BrowserHistory object will be instantiated and called as such:
44 * BrowserHistory obj = new BrowserHistory(homepage);
45 * obj.visit(url);
46 * String param_2 = obj.back(steps);
47 * String param_3 = obj.forward(steps);
48 */