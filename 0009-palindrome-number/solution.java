class Solution {
    public boolean isPalindrome(int x) {
                if(x < 0) return false;
        String check = String.valueOf(x);

        for(int i = 0 ; i < check.length() / 2 ; i++){
            if(check.charAt(i) != check.charAt(check.length() - 1 - i)) return false ;
        } 

        return true ;
    }
}
