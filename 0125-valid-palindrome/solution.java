class Solution {
    public boolean isPalindrome(String s) {
        return checkPalindrome(s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase());
    }

    boolean checkPalindrome(String s){
        char[] c = s.toCharArray();
        int n = c.length ;
        for(int i = 0 ; i < n/2 ;i++){
            if(c[i] != c[n-i-1])
            return false;
        }
        return true;
    }
}
