class Solution {
    public int[] minOperations(String boxes) {
        // if(boxes.length()==0 || boxes.length()==1){
        //     return [0];
        // }
        int num [] = new int [boxes.length()];
        for( int i=0;i<=boxes.length()-1;i++){
            int sum=0;
            for( int j=0;j<=boxes.length()-1;j++){
                if(i==j){
                    continue;
                }
                if(boxes.charAt(j)=='1'){
                    sum+=Math.abs(i-j);
                }
            }
            num[i]=sum;
        }
        return num;
    }
}









//  for(int j=i+1;j<=boxes.length()-1;j++){
        //         // if(i==j){
        //         //     continue;
        //         // }
        //         if(boxes.charAt(i)=='1'){
        //            sum+=Math.abs(j-i);
        //            System.out.println(i+" " + j + " " +Math.abs(j-i));
        //         }else{
        //             continue;
        //         }   
        //     }
        //      for(int j=0;j<i;j++){
        //         // if(i==j){
        //         //     continue;
        //         // }
        //         if(boxes.charAt(i)=='1'){
        //             sum+=Math.abs(j-i);
        //         System.out.println(i+" " + j + " " +Math.abs(j-i));
        //         }else{
        //             continue;
        //         }   
        //     }
        //     System.out.println(i+" "+sum);
        //     num[i]=sum; 
        // }