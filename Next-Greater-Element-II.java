class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int [] arr = new int [nums.length];
        for( int i=0;i<=nums.length-1;i++){
            boolean flag=false;
            for( int j=i+1;j<=nums.length-1;j++){
                if(nums[i]< nums[j]){
                    arr[i]=nums[j]; 
                    System.out.println(nums[i] + " "+ nums[j]);
                   flag= true;
                   break;
                }
            }
            if(flag==true){
                continue;
            }
            for( int j=0;j<=i-1;j++){
                if(nums[i]< nums[j]){
                    arr[i]=nums[j]; 
                    System.out.println(nums[i] + " "+ nums[j]);
                   flag= true;
                   break;
                }
            }
            if(flag==false){
                arr[i]=-1;
            }
        }
        return arr;
    }
}