class Solution {
    public String defangIPaddr(String address) {
        // StringBuilder str =new StringBuilder(address.replace('.',"[.]"));
        // for( char c : str.toString().toCharArray()){
        //     if(c=='.'){
        //         str.replace('.',"[.]"); 
        //     }
        // }
       return address.replace(".","[.]");
    }
}