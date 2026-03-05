1class Solution {
2    public int generateKey(int num1, int num2, int num3) {
3        String n1=zeroPadding(num1);
4        String n2=zeroPadding(num2);
5        String n3=zeroPadding(num3);   
6        StringBuilder s1 =new StringBuilder("");
7        for( int i=0;i<4;i++){
8            int a =Math.min(Character.getNumericValue(n1.charAt(i)),Character.getNumericValue(n2.charAt(i)));
9            int b = Math.min(Character.getNumericValue(n3.charAt(i)),Character.getNumericValue(n2.charAt(i)));
10            s1.append(Math.min(a,b)+"");
11        }   
12        return Integer.parseInt(s1.toString());  
13    }
14    public static String zeroPadding(int num){
15        int a=num;
16        int digit=0;
17        while(a!=0){
18            a=a/10;
19            digit++;
20        }
21        if(digit==4){
22            return new String(num +"");
23        }
24            StringBuilder s =new StringBuilder("");
25            while(4-digit!=0){
26                s.append(0+"");
27                digit++;
28            }
29            s.append(num+"");
30        
31        return s.toString();
32    }
33}