class Solution {
    public boolean isPalindrome(String s) {
        String res = s.toLowerCase(); // first converting to lower case 

        String newString = ""; 
        for(int i = 0 ; i < res.length() ; i++){ // this is for new string taking only alphanumeric characters 
            int x = (int)res.charAt(i);
            if( (x >= 48 && x <= 57) || (x >= 65 && x <= 90) || (x >= 97 && x <= 122) )
            newString += res.charAt(i);
        }

        for(int i = 0 ; i < newString.length() ; i++){ // this is for checking the palindrome case 
            if(newString.charAt(i) != newString.charAt(newString.length()-i-1)) return false;
        }

        return true ;
    }
}
