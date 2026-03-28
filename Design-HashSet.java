1class MyHashSet {
2    private hset head=null;
3    public MyHashSet() {
4        
5    }
6    
7    public void add(int key) {
8        if(contains(key)){
9            return;
10        }
11        hset node =new hset(key);
12        if(head==null){
13            head=node;
14            return;
15        }
16        hset n = head;
17        while(n.next!=null){
18            n=n.next;
19        }
20        n.next=node;
21    }
22    
23    public void remove(int key) {
24        if(head==null){
25            return;
26        }
27        if(head.key==key){
28            head=head.next;
29            return;
30        }
31        hset n = head;
32        while(n.next!=null){
33            if(n.next.key==key){
34                n.next=n.next.next;
35                return;
36            }
37            n=n.next;
38        }
39    }
40    
41    public boolean contains(int key) {
42        hset node=head;
43        while(node!=null){
44            if(node.key==key){
45                return true;
46            }
47            node=node.next;
48        }
49        return false;
50    }
51    class hset{
52        int key;
53        hset next;
54        public hset(int key){
55            this.key=key;
56            next=null;
57        }
58        public hset(){
59
60        }
61    }
62}
63
64/**
65 * Your MyHashSet object will be instantiated and called as such:
66 * MyHashSet obj = new MyHashSet();
67 * obj.add(key);
68 * obj.remove(key);
69 * boolean param_3 = obj.contains(key);
70 */