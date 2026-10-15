class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if(candidates.length<=1 && candidates[0]>target){
            return new ArrayList<>();
        }
        Arrays.sort(candidates);
        Set<List<Integer>> list = new HashSet<>();
        callfun(0,target,candidates.length,candidates,new ArrayList<>(),list);
        return new ArrayList<>(list);
    }
    void callfun(int i, int target, int N , int [] candidates, List<Integer> arr ,Set<List<Integer>> list){
        if(target==0 && arr.size()>=1){
            //  Collections.sort(arr); 
                // System.out.println(arr);
                list.add(new ArrayList<>(arr));
                return;
        }
        if(i>=N){
            if(target==0 && arr.size()>=1){   
                // Collections.sort(arr); 
                // System.out.println(arr);
                list.add(new ArrayList<>(arr));
            }
            return ;
        }
        // if(target<candidates[i]){
        //     return ; 
        // }
        // if(candidates[i]>target){
        //     return;
        // }
        for( int j = i ; j < candidates.length;j++){
            if( j>i && candidates[j]==candidates[j-1]){continue;}
            if(candidates[j] > target ) break ;
                arr.add(candidates[j]);
                // System.out.println(arr);
                // sum+=candidates[i];
                callfun(j+1,target-candidates[j],N,candidates,arr,list);
                arr.remove(arr.size()-1);
            }
        }
        // if(candidates[i]<=target){
        // arr.add(candidates[i]);
        // System.out.println(arr);
        // // sum+=candidates[i];
        // callfun(i+1,target-candidates[i],N,candidates,arr,list);
        // arr.remove(arr.size()-1);
        // // sum-=candidates[i];
        // }
        // callfun(i+1,target,N,candidates,arr,list);
    
}
























// class Solution {
//     public List<List<Integer>> combinationSum2(int[] candidates, int target) {
//         // shuffle(candidates);
//         // Arrays.sort(candidates);
//         Set<List<Integer>> list = new HashSet<>();
//         callfun(0,(double)target,0,candidates,list,new ArrayList<>());
//         return new ArrayList<>(list);
//     }
//     void callfun(int i , double target, double sum,int [] arr, Set<List<Integer>> list, List<Integer> ds){
//          if(target==0){
//             // if(ds.size()>=1){
//             Collections.sort(ds);
//             list.add(new ArrayList<>(ds));
//             // }
//             return ;
//          }
//         if(i>=arr.length){
//             if(ds.size()>=1){
//                 if(0==target){
//             list.add(new ArrayList<>(ds));
//             }
//             }
//             // if(sum==target){
//             //         for(List<Integer> k : list){
//             //         if(k.equals(ds)){
//             //             return;
//             //         }
//             //     }
//             //     list.add(new ArrayList<>(ds));
//             // }
//             return;
//         }
//         // if(target==0){
//         //     // if(ds.size()>=1){
//         //     list.add(new ArrayList<>(ds));
//         //     // }
//         //     // for(List<Integer> k : list){
//         //     //     if(k.equals(ds)){
//         //     //         return;
//         //     //     }
//         //     // }
//         //     // list.add(new ArrayList<>(ds));
//         //     return;
//         // }
//         // if(target < sum){
//         //     return;
//         // }
//             ds.add(arr[i]);
//             sum+=arr[i];
//             callfun(i+1,target-arr[i],sum,arr,list,ds);
//             ds.remove(ds.size()-1);
//             sum-=arr[i];
//             callfun(i+1,target,sum,arr,list,ds);
//         }
//     // public static void shuffle(int [] arr){
//     //     Random rd= new Random();
//     //     for( int i=0;i<arr.length-1;i++){
//     //         int j = rd.nextInt(arr[i+1]);
//     //         int temp=arr[i];
//     //         arr[i]=arr[j];
//     //         arr[j]=temp;
//     //     }
//     // }
//     static void shuffle(int [] nums){
//         Random rd = new Random();
//         for( int i=nums.length-1;i>=0;i--){
//             int j= rd.nextInt(i+1);
//             int k=nums[j];
//             nums[j]=nums[i];
//             nums[i]=k;
//         }
//     }
// }
