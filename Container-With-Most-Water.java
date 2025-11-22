class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int m=0;
        while(left<right){
            int c =(right-left)*Math.min(height[left],height[right]);
            m=Math.max(m,c);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return m;
    }
}