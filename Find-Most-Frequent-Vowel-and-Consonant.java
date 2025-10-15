class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> vowel = new HashMap<>();
        HashMap<Character,Integer> con = new HashMap<>();
        for( char ch : s.toCharArray()){
            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowel.put(ch,vowel.getOrDefault(ch,0)+1);
            }else{
                con.put(ch,con.getOrDefault(ch,0)+1);
            }
        }
        System.out.println(vowel);
        System.out.println(con);
        int max=0;
        for(Map.Entry<Character,Integer> entry : vowel.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
            }
        }
        int m2=0;
        for(Map.Entry<Character,Integer> entry : con.entrySet()){
            if(entry.getValue()>m2){
                m2=entry.getValue();
            }
        }
        System.out.println(max+" " +m2);
        return max+m2;
    }
}