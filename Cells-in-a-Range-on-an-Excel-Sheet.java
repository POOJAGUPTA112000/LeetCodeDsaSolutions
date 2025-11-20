class Solution {
    public List<String> cellsInRange(String str) {
        ArrayList<String> list =new ArrayList<>();
        char i = str.charAt(0);
        char iend=str.charAt(3);
        char j= str.charAt(1);
        char jend=str.charAt(4);
        for( char ch = i ; ch <=iend;ch++){
            for( char jh =j;jh<=jend;jh++){
                list.add(""+ch+jh);
            }
        }
       return list;
    }
}