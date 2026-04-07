1class Solution {
2    public int countSegments(String s) {
3        if(s.length()==0){
4            return 0;
5        }
6        if(s.length()==1 && s.charAt(0)!=' '){
7            return 1;
8        }
9        int count=0;
10        int charCount=0;
11        for( int i=1;i<=s.trim().length()-1;i++){
12            if(s.charAt(i)!=' '){
13                charCount++;
14            }
15            if(s.charAt(i-1)!=' ' && s.charAt(i)==' '){
16                count++;
17            }
18        }
19        if(charCount>0){
20        count++;
21        }
22        // if((count-space)==1){
23        //     count++;
24        // }
25        return count;
26        // // String [] arr = s.trim().split(" ");
27        // // return arr.length;
28        // int count=0;
29        // StringBuilder str = new StringBuilder("");
30        // for(int i=0;i<=s.length()-1;i++){
31        //    if(s.charAt(i)!=' '){
32        //     str.append(s.charAt(i));
33        // //    if(i==0){
34        // //     count++;
35        // //    }
36        //    }else{
37        //     str = new StringBuilder("");
38        //     count++;
39        //     // if(count!=1){
40        //     //     count++;
41        //     // }
42        //    }
43        // }
44        // return count;
45        // // for( int i=0;i<s.length()-1;i++){
46        // //    if(s.charAt(i)&& s.charAt(i+1)){
47        // //     continue;
48        // //    } 
49        // // }
50        // // // ArrayList<String> arr = new ArrayList<>(s.split(" "));
51        // // String arr [] =s.split(" ");
52        // // return arr.length;
53    }
54}