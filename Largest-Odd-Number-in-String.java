1class Solution {
2    public String largestOddNumber(String num) {
3        if(Character.getNumericValue(num.charAt(num.length()-1))%2!=0){
4            return num;
5        }
6        int left=0;
7        for( int i=num.length()-1;i>=0;i--){
8            if(Character.getNumericValue(num.charAt(i))%2!=0){
9            return num.substring(0,i+1);  
10            }
11        }
12        return "";
13    }
14}