1class Solution {
2    public int dayOfYear(String date) {
3        int sum=0;
4        int day =Integer.parseInt(date.substring(8,10));
5        int mt = Integer.parseInt(date.substring(5,7));
6        int y = Integer.parseInt(date.substring(0,4));
7
8
9        sum+=month(date.substring(5,7));
10        System.out.println("month "+ sum);
11
12        sum+=Integer.parseInt(date.substring(8,10));
13        System.out.println("days "+ sum);
14
15        if(mt>2){
16        sum+=leapYearOrNot(y);      
17        }
18         System.out.println("yearcount "+ sum);     
19        return sum;
20    }
21    public static int leapYearOrNot(int st){
22        int year = st ;
23        if( (year %4==0 && year%100 !=0) || (year %400 ==0)){
24                return 1;
25        }
26        return 0;
27    }
28    public static int month(String st){
29        int m = Integer.parseInt(st);
30        int days=0;
31        for(int i=1 ; i<m ; i++){
32            days+=countdays(i);
33        }
34        return days;
35    }
36    public static int countdays( int i){
37        switch(i){
38            case 1:
39            case 3:
40            case 5:
41            case 7:
42            case 8:
43            case 10:
44            case 12:
45              return 31;
46            case 2:
47            return 28;
48            default:
49            return 30;    
50        }
51    }
52    
53}