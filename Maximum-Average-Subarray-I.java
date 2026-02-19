1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        double sum=0;
4        int i=0;
5        while(i<k && i<nums.length){
6            sum+=nums[i];
7            i++;
8        }
9        double avg=sum/k;
10        int left=0;
11        for(i=k;i<=nums.length-1;i++){
12            sum=sum+nums[i]-nums[left];
13            avg=Math.max(avg,sum/k);
14            left++;
15        }
16        return avg;
17    }
18}