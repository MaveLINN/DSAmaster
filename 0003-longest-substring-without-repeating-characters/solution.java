class Solution {
    public int lengthOfLongestSubstring(String s) {

        int[] has = new int[256];
        Arrays.fill(has,-1);
        int check = -1 , res = 0 ;

        int n = s.length();
        for(int i = 0 ; i < n ; i++){
            if(has[s.charAt(i)] > check){
                check = has[s.charAt(i)];
            }
            res = Math.max(res , i - check);
            has[s.charAt(i)] = i ;
        }
        
        return res ;
    }
}
