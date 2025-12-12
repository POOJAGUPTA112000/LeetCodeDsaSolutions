1class Solution {
2    public String reverseOnlyLetters(String s) {
3        char [] arr = s.toCharArray();
4        System.out.println(arr);
5        int i=0;
6        int j=s.length()-1;
7        while(i<=j){
8            int k =(int)arr[i];
9            if(!((k>=65 && k<=90) || (k>=97 && k<=122))){
10                i++;
11                continue;
12            }
13            int b = (int)arr[j];
14            if(!((b>=65 && b<=90) || (b>=97 && b<=122))){
15                j--;
16                continue;
17            }
18            char a =arr[i];
19            arr[i]=arr[j];
20            arr[j]=a;
21            i++;
22            j--;  
23        }
24        StringBuilder str =new StringBuilder("");
25        for(char ch : arr){
26            str.append(ch);
27        }
28        return str.toString();
29    }
30}