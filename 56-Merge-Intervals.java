class Solution {
    public int[][] merge(int[][] intervals) {
        int [][] m1 = new int[intervals.length][intervals[0].length];
        for(int i =0 ; i<intervals.length-1 ; i++){
            for(int j=i+1;j<intervals.length;j++){
                if(intervals[i][0]>intervals[j][0]){
                    int k=intervals[i][0];
                    intervals[i][0]=intervals[j][0];
                    intervals[j][0]=k;
                    k=intervals[i][1];
                    intervals[i][1]=intervals[j][1];
                    intervals[j][1]=k;
                }
            }
        }
        ArrayList<int[]> list =new ArrayList<>();
        int s =intervals[0][0];
        int e =intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(e>=intervals[i][0]){
                e=Math.max(e,intervals[i][1]);
            }else{
                list.add(new int[]{s, e});
                // int [] [] p = new int [1][0];
                // p[0][0]=s;
                // p[0][1]=e;
                // list.add(p);
                // // list.add(new int []{s,e});
                s=intervals[i][0];
                e=intervals[i][1];
            }
        } 
        list.add(new int [] {s,e});
        return list.toArray(new int[list.size()][]);
    }
}