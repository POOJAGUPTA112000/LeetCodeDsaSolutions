class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<=s.length()-1;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        // char ch;
        // for(Map.Entry<Character,Integer> list : map.entrySet()){
        //     if(list.getValue()==1){
        //         ch = list.getKey();
        //         break;
        //     }
        // }
        for( int i=0;i<=s.length()-1;i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}