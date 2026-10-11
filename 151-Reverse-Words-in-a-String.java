class Solution {
    public String reverseWords(String s) {
        String [] arr = s.trim().split(" ");
        System.out.println(Arrays.toString(arr));
        // Collections.reverse(Arrays.asList(arr));
        StringBuilder str =new StringBuilder();
        for(int i = arr.length-1;i>=0;i--){
           if(arr[i].trim().equals("")){
           continue;
           }
            str.append(arr[i].trim()+" ");
        }
        str.deleteCharAt(str.length()-1);
        return str.toString();
        // return str.deleteCharAt(str.length()-1);

        // return " ";
    }
}