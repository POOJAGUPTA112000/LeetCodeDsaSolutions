1class Solution{
2    public String convertToBase7(int num){
3        if(num==0){
4            return num+"";
5        }
6        StringBuilder str = new StringBuilder("");
7        boolean flag=true;
8        if(num<0){
9            flag=!flag;
10            num=Math.abs(num);
11        }
12        while(num!=0){
13            // if(Integer.MAX_VALUE )
14            str.append(num%7+"");
15            num=num/7;
16        }
17        if(flag==false){
18            return "-" + str.reverse().toString();
19        }
20        return str.reverse().toString();
21    }
22}
23// SEX XUX 
24// MUJHE BAR BAR IGNORED FEEL HOTA HAI
25// SELF DOUGHT HOTA HAI 
26// RELATION FUTURE BHUT DENSE LAGTA HAI 
27// OR TUMAHRA POINT OFF VIEW ON DIFFERNT SITUTIONS 