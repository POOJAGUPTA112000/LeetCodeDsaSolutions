class Solution {
    public int largestPerimeter(int[] nums) {
        int max=0;
        if(nums.length<3){
            return 0;
        }
        Arrays.sort(nums);
        // mergesort1(nums);
        for( int i=nums.length-1;i>=2;i--){
           int a =nums[i];
           int b =nums[i-1];
           int c =nums[i-2];
           if(b+c>a){
            if(max<a+b+c){
                max=a+b+c;
            }
           }
        }
      
        return max;
    } 
    // public static boolean colinear( int a,int b,int c){
    //     if((0.5*Math.abs(a*(b-c)+b*(c-a)+c*(a-b))) == 0){
    //             return false;
    //     }
    //     return true;
    // }   
        public static void mergesort1( int [] nums){
            if( nums.length<=1){
                return;
            }
            int middle = nums.length/2;
            int left [] =new int [middle];
            int right [] = new int [nums.length-middle];
            int i=0,j=0;
            for(;i<=nums.length-1;i++){
                if(i<middle){
                    left[i]=nums[i];
                }else{
                    right[j]=nums[i];
                    j++;
                }
            }
            mergesort1(left);
            mergesort1(right);
            merge(left,right,nums);
   }
   private static void merge( int [] left , int [] right,int [] nums){
    int r=0;
    int l=0;
    int i=0;
    while(r<right.length && l<left.length){
        if(left[l]<right[r]){
            nums[i]=left[l];
            l++;
            i++;
        }else{
            nums[i]=right[r];
            r++;
            i++;
        }
    }
    while(l<left.length){
        nums[i]=left[l];
        l++;
        i++;
    }
    while(r<right.length){
        nums[i]=right[r];
        r++;
        i++;
    }
   }

        
}
