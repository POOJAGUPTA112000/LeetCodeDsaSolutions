class Solution {
    public String reverseVowels(String s) {
        char ch [] = s.toCharArray(); 
        int left=0;
        int right=ch.length-1;
        System.out.println(ch);
        while(left<=right){
            if(isVowel(ch[left]) && isVowel(ch[right])){
                char c = ch[left];
                ch[left]=ch[right];
                ch[right]=c;
                right--;
                left++;
                 }else{
                    if(isVowel(ch[left]) && !(isVowel(ch[right]))){
                        right--;
                    }else{
                        if(!isVowel(ch[left]) && (isVowel(ch[right]))){
                        left++;
                        }else{
                            right--;
                            left++;
                        }
                    }
                }
            }
            // System.out.println(Arrays.toString(ch));
            StringBuilder str =new StringBuilder();
            for(char c: ch){
                str.append(c);
            }
            return str.toString();
            // return Arrays.toString(ch);
            // return "sir";
    }
     public static boolean isVowel(char ch){
        char c = Character.toLowerCase(ch);
        switch(c){
            case 'a':
            case 'e':
            case 'o':
            case 'i':
            case 'u':
            return true;
            default:
            // return false;
        }
        return false;
    }
}