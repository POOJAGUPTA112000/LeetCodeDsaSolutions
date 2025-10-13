class Solution {
    public int maxNumberOfBalloons(String text) {
        if(text.length()<7){
            return 0;
        }
        HashMap<Character,Integer> map =new HashMap<>();
        String str = "balon";
        for( char ch : str.toCharArray()){
            map.put(ch,0);
        }
       
        for( char ch : text.toCharArray()){
            if(str.contains(ch+"")){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
        }
        map.put('l', map.get('l') / 2);
        map.put('o', map.get('o') / 2);
        int min=Integer.MAX_VALUE;
        // int id=0;
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
                if(min>entry.getValue()){
                    min=entry.getValue();
                    // id=entry.getKey();
                }
        }

    return min;
    }
}