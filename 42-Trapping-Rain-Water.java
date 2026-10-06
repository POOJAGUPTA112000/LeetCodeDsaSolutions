class Solution {
    public int trap(int[] height) {
     int [] lmax=new int [height.length];
     int [] rmax=new int [height.length];
     int min=height[0]; 
     int max=height[height.length-1]; 
     lmax[0]=min;
     rmax[0]=max; 
    for( int i=1;i<height.length;i++){
            min=Math.max(height[i],min);
            lmax[i]=min;
    }
    for( int i=height.length-1;i>=0;i--){
        max=Math.max(height[i],max);
        rmax[i]=max;
    }
    int water=0;
    for( int i=0;i<height.length;i++){
        water=water+(Math.min(lmax[i],rmax[i])-height[i]);
    }
    return water;
    }
}