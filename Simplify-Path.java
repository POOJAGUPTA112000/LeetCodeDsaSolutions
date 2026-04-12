1class Solution {
2    public String simplifyPath(String path) {
3        String [] arr =path.split("/");
4        Stack<String> st =new Stack<>();
5        System.out.println(Arrays.toString(arr));
6        for( String s : arr){
7            if(s.length()==0 || s.trim().equals(".")){
8                continue;
9            }else{
10                if(s.trim().equals("..")){
11                    if(st.size()>=1){
12                        st.pop();
13                    }
14                }else{
15                    st.push(s);
16                }
17            }
18        }
19        StringBuilder str = new StringBuilder ("");
20        if(st.size()<=0){
21            return "/";
22        }
23        for(String p : st){
24            str.append("/"+p);
25        }
26        return str.toString();
27    }
28}
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
47// class Solution {
48//     public String simplifyPath(String path) {
49//         Stack<String> st =new Stack<>();
50//         for(int i=0;i<=path.length()-1;i++){
51//             if(path.charAt(i)=='/'){
52//                 StringBuilder str = new StringBuilder("/");
53//                 i++;
54//                 while(i<=path.length()-1 && (path.charAt(i)!='/')){
55//                     str.append(path.charAt(i));
56//                     System.out.println(path.charAt(i));
57//                     i++;
58//                 }
59//                      i--;
60//                 if(str.toString().length()==1){
61//                     continue;
62//                 }
63//                 if(str.toString().equals("/.")){
64//                     continue;
65//                 }else{
66//                     if(str.toString().equals("/..")){
67//                         if(st.size()>=1){
68//                         st.pop();
69//                         }
70//                     }else{
71//                         st.push(str.toString());
72//                         System.out.println("str =>" + str.toString());
73//                     }
74//                 }
75//             }
76//         }
77//         if(st.size()<=0){
78//             return "/";
79//         }
80//         StringBuilder smain = new StringBuilder();
81//         for(int i =0 ;i<=st.size()-1;i++){
82//             smain.append(st.get(i));
83//         }
84//         return smain.toString();
85//     }
86// }