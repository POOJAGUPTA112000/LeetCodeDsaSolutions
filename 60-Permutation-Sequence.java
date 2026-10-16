class Solution {
    static String fd ;
    static int count=0;
    public  static String getPermutation(int n, int k) {
        // boolean [] flag =  new boolean [n];
        List<String> list = new ArrayList<>();
        boolean flag [] = new boolean [n]; 
        int [] nums = new int [n];
        for( int i=1;i<=n;i++ ){
            nums[i-1]=i;
        }
        count = 0;
        fd="";
        callfun(nums,k,new StringBuilder(""),flag);
        System.out.println(fd);
        return fd;
        // return list.get(k-1);
    }
    static boolean callfun(int [] nums,int k,StringBuilder ds ,boolean [] flag){
        if(ds.length()==nums.length){
            // list.add(ds.toString());
            count++;
            if(count==k){
                fd=ds.toString();
                return true;
            }
            return false;
        }
        // if(list.size()==k){
        //     return true;
        // }
        for( int i=0;i<nums.length;i++){
            if(!flag[i]){
                flag[i]=true;
                ds.append(nums[i]);
                if(callfun(nums,k,ds,flag)) return true;
                ds.deleteCharAt(ds.length()-1);
                flag[i]=false;
            }
            // swap(nums,j,i);  
            // callfun(j+1, nums,k,list);
            // swap(nums,j,i);
        }
        return false;
    }
    // static void swap( int [] nums,int a , int b ){
    //     int temp=nums[a];
    //     nums[a]=nums[b];
    //     nums[b]=temp;
    // }
}