class Solution {
    public static String longestPalindrome(String s) {
        int n = s.length() , res = 0 , maxLength = -1 , startIndex = 0;
        String resString = "";
        for (int i = 0 ; i < n ; i++){
            int x = palin(s,i,i);
            int xx = palin(s,i,i+1);
            res = Math.max(x,xx);

            if(res > maxLength){
                maxLength = res;
                startIndex = i - ((maxLength - 1)/2);
            }
        }
        resString = s.substring(startIndex,startIndex+maxLength);
        return resString ;
    }

    public static int palin(String s, int l , int r){
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;r++;
        }
        return r-l-1;
    }

    // racecar
    // abccba
}
