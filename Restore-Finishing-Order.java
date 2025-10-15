class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int [] final1 = new int [friends.length];
        LinkedHashMap<Integer,Integer> map =new LinkedHashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int f : friends) {
            list.add(f); // auto-boxing from int -> Integer
        }
        int j=0;
        for( int i=0;i<=order.length-1;i++){
            if(list.contains(order[i])){
                final1[j]=order[i];
                j++;
            }
        }
        return final1;
    }
}














































// class Solution {
//     public int[] recoverOrder(int[] order, int[] friends) {
        
//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int i : friends ){
//             if(Arrays.asList(order).contains(i)){
//                 int index =Arrays.asList(order).indexOf(i);
//                 map.put(i,index);
//             }
//         }
//         int [] arr =new int [friends.length];
        
//         System.out.println(map);
//         for( int i=0;i<=friends.length-1;i++){
//             int min=Integer.MAX_VALUE;
//             int num=0;
//             for(Map.Entry<Integer,Integer> entry : map.entrySet()){
//                 if(entry.getValue()<min){
//                     min=entry.getValue();
//                     num =entry.getKey();
//                 }
//             }
//             arr[i]=num;
//             map.remove(num);
//         }
//         return arr;
//     }
// }