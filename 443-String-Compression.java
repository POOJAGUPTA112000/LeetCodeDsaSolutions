class Solution {
    public int compress(char[] chars) {
        if(chars.length==1){
            return 1;
        }
        int i=0;
        int k=0;
        int count=1;
        for(int j=1;j<chars.length;j++){
            if(chars[i]==chars[j]){
                count++;
            }else{
                chars[k]=chars[i];
                i=j;
                k++;
                if(count==1){
                    continue;
                }else{
                if(count>1 && count<10){
                    chars[k]=(char)(count+'0');
                    k++;
                }else{
                    int q=0;
                    String st =count+"";
                    while(q<st.length()){
                        chars[k]=st.charAt(q);
                        q++;
                        k++;
                    }
                }
                }
                count=1;
            }
        }
        chars[k]=chars[i];
        k++;
        if(count==1){
            return k;
        }
        if(count<10){
            chars[k]=(char)(count+'0');
            k++;
        }else{
            int q=0;
                String st = count+"";
                while(q<st.length()){
                    chars[k]=st.charAt(q);
                    q++;
                    k++;
            }
        }
        return k;
    }
}