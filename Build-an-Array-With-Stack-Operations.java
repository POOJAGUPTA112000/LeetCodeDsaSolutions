class Solution {
    public List<String> buildArray(int[] target, int n) {
        Stack<Integer> st = new Stack<>();
        int j=0;
        List<String> list = new ArrayList<>();
        for(int i=1;i<=target[target.length-1];i++){
            if(st.size()>0){
                // if(target[target.length-1]<)
                if(target[j]==i){
                    st.push(i);
                    j++;
                    list.add("Push");
                }else{
                    list.add("Push");
                    list.add("Pop");
                }
            }else{
                if(target[j]==i){
                    st.push(i);
                    j++;
                    list.add("Push");
                }else{
                    list.add("Push");
                    list.add("Pop");
                }
                
            }
        }
        return list;
    }
}