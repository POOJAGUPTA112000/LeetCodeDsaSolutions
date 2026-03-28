1class MyHashMap {
2    public mapValue head = null;
3    public MyHashMap() {
4    }    
5    public void put(int key, int value){
6        mapValue node1 =head;
7        while(node1!=null){
8            if(node1.key==key){
9                node1.value=value;
10                return;
11            }
12            node1=node1.next;
13        }
14        mapValue m = new mapValue();
15        m.key=key;
16        m.value=value;
17        if(head==null){
18            head=m;
19            return;
20        }
21        mapValue node = head;
22        while(node.next!=null){
23            node=node.next;
24        }
25        node.next=m;
26    }
27    
28    public int get(int key) {
29        mapValue node = head;
30        while(node!=null){
31            if(node.key==key){
32                return node.value;
33            }
34            node=node.next;
35        }
36        return -1;
37    }
38    
39    public void remove(int key) {
40        if(head==null){
41            return;
42        }
43        mapValue node = head;
44        if(node.key==key){
45            head=node.next;
46            return;
47        }
48        while(node.next!=null){
49            if(node.next.key==key){
50                node.next=node.next.next;
51                return;
52            }
53            node=node.next;
54        }
55        // if(node.next.key==key){
56        //     node.next=null;
57        // }
58    }
59    class mapValue{
60        int key;
61        int value;
62        mapValue next;
63        public mapValue(){
64            key=0;
65            value=0;
66        }
67        public mapValue(int key,int value){
68            this.key=key;
69            this.value=value;
70            next=null;
71        } 
72    }
73}
74
75/**
76 * Your MyHashMap object will be instantiated and called as such:
77 * MyHashMap obj = new MyHashMap();
78 * obj.put(key,value);
79 * int param_2 = obj.get(key);
80 * obj.remove(key);
81 */