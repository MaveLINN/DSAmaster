class Solution {
    public int maxVowels(String s, int k) {

        int n = s.length() ;
        int res = 0 , ct = 0;

        int j = 0 , i = 0 ;
        while( j < n){ // "leetcode"
            if(s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'o' || s.charAt(j) == 'u')ct++;

            if(j-i+1 < k) j++;
            else{
                if(j-i+1 == k){
                    res = Math.max(res,ct);
                    
                  if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') ct--;

                  i++ ; j++ ;

                }
            }
        }
        return res ;
    }
}

