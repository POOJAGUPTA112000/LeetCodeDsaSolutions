1class Solution {
2    public int findComplement(int num) {
3        StringBuilder str = new StringBuilder("");
4        while(num>=1){
5            str.append(toogle(num%2) +"");
6            num=num/2;
7            // sum+=(toogle(num%2) * Math.pow(2,)
8        }
9        
10        str.append(num+"");
11        System.out.println(str.reverse().toString());
12        int sum=0;
13        for( int i=0;i<=str.toString().length()-1;i++){
14            sum+=(Character.getNumericValue(str.toString().charAt(i)) * Math.pow(2,str.toString().length()-1-i)); 
15        }
16        return sum;
17
18    }
19    public int toogle(int val){
20        if(val==0){
21            return 1;
22        }
23        return 0;
24    }
25}