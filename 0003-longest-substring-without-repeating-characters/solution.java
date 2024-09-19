class Solution {
    public static int lengthOfLongestSubstring(String s) {
       int[] a = new int[256];
       for(int i = 0 ; i < 256 ; i++)a[i] = -1;
       int check = -1 , res = 0 ;
       for(int i = 0 ; i < s.length() ; i++){
           if(a[s.charAt(i)] > check ){
               check = a[s.charAt(i)];
           }
           a[s.charAt(i)] = i ;
           res = Math.max(res,i-check);
       }
        return res ;
    }
}
