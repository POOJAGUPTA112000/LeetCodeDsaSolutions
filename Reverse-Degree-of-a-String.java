class Solution {
    public int reverseDegree(String s){
        int pro=97;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=26;i>=1;i--){
            map.put((char)pro,i);
            pro++;
        }
        System.out.println(map);
        pro=0;
        for(int i=0;i<=s.length()-1;i++){
            pro+=(map.get(s.charAt(i))*(i+1));
        }
        return pro;
    }
}

// class Solution {
//     public int reverseDegree(String s){
//         int pro=0;
//         for(int i=0;i<=s.length()-1;i++){
//             pro+=(i+1)*(26-(s.charAt(i)-'a'));
//         }
//         return pro;
//     }
// }
