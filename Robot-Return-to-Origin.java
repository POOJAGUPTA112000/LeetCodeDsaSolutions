1class Solution {
2    public boolean judgeCircle(String moves) {
3        int cud=0;
4        int crl=0;
5        for( int i=0;i<=moves.length()-1;i++){
6            if(moves.charAt(i)=='U' || moves.charAt(i)=='D'){
7                cud+=findValue(moves.charAt(i));
8            }else{
9                crl+=findValue(moves.charAt(i));
10            }
11        }
12        if(cud==0 && crl == 0){
13            return true;
14        }
15        return false;
16    }
17    public static int findValue( char c) {
18        switch(c){
19            case 'U':
20            case 'R':
21            return 1;
22            default:
23            return -1;
24        }
25    }
26}