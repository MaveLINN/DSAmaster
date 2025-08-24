class Solution {
    public String longestPalindrome(String s) {

        int n = s.length();
        int resLength = 0 ;
        String resString = "";
        int startIndex = 0 , maxLength = 0 ;
        for(int i = 0 ; i < n ; i++){
            int x = palendrome(s,i,i);
            int xx = palendrome(s,i,i+1);
            resLength = Math.max(x,xx);
        
            if(resLength > maxLength){
                maxLength = resLength ;
                startIndex = i - ((maxLength-1)/2);
            }
        }
        resString = s.substring(startIndex,startIndex + maxLength);
        return resString ;
    }

    int palendrome(String s , int l , int r){
        while(l >=0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l-- ; r++ ;
        }
        return r-l-1;
    }
 // 01  2345678  9 10
 // ca  racecar  v c
}
