class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>(); // store indices

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && temp[i] > temp[st.peek()]) {
                int idx = st.pop();
                ans[idx] = i - idx;
            }
            st.push(i);
        }
        return ans;
    }
}


















// class Solution {
//     public int[] dailyTemperatures(int[] temperatures) {
//         int arr[] =new int[temperatures.length];
//         int k=0;
//      for( int i =0;i<temperatures.length-1;i++){
//         boolean flag = false;
//         Stack<Integer> st =new Stack<>();
//         for(int j=i+1;j<=temperatures.length-1;j++){            
//             if(temperatures[i]<temperatures[j]){
//                 st.push(temperatures[j]);
//                 flag =true;
//                 break;                
//             }else{
//                 st.push(temperatures[j]);
//             }
//         }
//         if(flag==true){
//             arr[k]=st.size();
//         }else{
//             arr[k]=0;
//         }
//         k++;
//      }
//      arr[k]=0;
//      return arr;
//     }
// }













// class Solution {
//     public int[] dailyTemperatures(int[] temp) {
//         int [] arr =new int[temp.length];
//         int k=0;
//         for( int i=0;i<temp.length-1;i++){
//             int count=0;
//             for( int j=i+1;j<=temp.length-1;j++){
//             if(temp[i]<temp[j]){
//                 count++;
//                 break;
//             }else{
//                 count++;
//             }
//             }
//             arr[k]=count;
//             k++;
//         }
//         arr[k]=0;
//         return arr;
//     }
// }