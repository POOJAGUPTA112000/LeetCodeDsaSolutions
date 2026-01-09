1class Solution {
2    public String[] findOcurrences(String text, String first, String second) {
3        String [] str = text.split(" ");
4        ArrayList<String> arr =new ArrayList<>();
5        for(int i =0;i<=str.length-3;i++){
6            if(str[i].equals(first) && str[i+1].equals(second)){
7                arr.add(str[i+2]);
8            }
9        }
10        // String[] array = list.toArray(String[]::new);
11        String [] newarr = arr.toArray(String[]::new);
12        return newarr;
13    }
14}