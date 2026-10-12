class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 || s.length()<=numRows){
            return s;
        }
        ArrayList<StringBuilder> row = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            row.add(new StringBuilder());
        }
        int current=0;
        boolean godown=false;
        for( char s1 : s.toCharArray()){
            row.get(current).append(s1);
            if(current==0 || current==numRows-1){
                godown=!godown;
            }
            current+= godown?1:-1;
        }
        StringBuilder snew = new StringBuilder("");
        for(StringBuilder st : row ){
            snew.append(st);
        }
        return snew.toString();
    }
}