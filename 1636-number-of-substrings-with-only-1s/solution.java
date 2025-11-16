class Solution {
    public final int mod = 1000000007 ;
    public int numSub(String s) {
        long count = 0 , res = 0 ;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '1')count++;
            else{
                res = ( res + stringCount(count))%mod;

                count = 0 ;
            }
        }
        res += stringCount(count);
        return (int)res%mod ;
    }

    public long stringCount(long size){
        return ((size*(size + 1))/2) % mod ;
    }
}
