class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int [] c =new int [A.length];
        for( int i=0;i<=c.length-1;i++){
            c[i]=commonA(i,A,B);
        }
        return c;
    }
    public int commonA( int i ,int [] A ,int [] B){
        int count=0;
        for( int j=0;j<=i;j++){
            for( int k=0;k<=i;k++){
                if(A[j]==B[k]){
                    count++;
                }
            }
        }
        return count;
    }
}