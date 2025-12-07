1class Solution {
2    public List<String> stringMatching(String[] words) {
3        List<String> l= new ArrayList<>();
4        for( int i=0;i<=words.length-1;i++){
5            for( int j=0;j<=words.length-1;j++){
6                if(i==j){
7                    continue;
8                }
9                if(words[j].contains(words[i])){
10                    l.add(words[i]);
11                    break;
12                }
13            }
14        }
15        return l;
16    }
17}