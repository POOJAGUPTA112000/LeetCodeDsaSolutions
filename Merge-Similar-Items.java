class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> ret =new ArrayList<>();
        TreeMap<Integer,Integer> t = new TreeMap<>();
        for(int i=0; i <=items1.length-1;i++){
            t.put(items1[i][0],items1[i][1]);
        }
        for(int j=0;j<=items2.length-1;j++){
            if(t.containsKey(items2[j][0])){
                int k=t.get(items2[j][0])+items2[j][1];
                t.put(items2[j][0],k);
            }else{
                t.put(items2[j][0],items2[j][1]);
            }
        }
        for(Map.Entry<Integer,Integer> entry : t.entrySet()){
            ret.add(Arrays.asList(entry.getKey(),entry.getValue()));
        }
        return ret;
    }
}