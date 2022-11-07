class Solution {
    public boolean isAnagram(String s, String t) {

    if(s.length() != t.length()) return false ; // for anagram length should be equal ;

    int[] hash = new int[26]; // hash array for a-z alphabets

    for(int i = 0 ; i < s.length() ; i++){  // for first string hash array will hold the increment by 1.
        hash[(int)s.charAt(i) - 97]++;
    }

     for(int i = 0 ; i < t.length() ; i++){ // for second string hash array will hold the decrement by 1.
        hash[(int)t.charAt(i) - 97]--;
    }

    for(int i = 0 ; i < 26 ; i++){      // if the element of hash array is 0 . it means all the alphabets are used and return true . If not equal to zero it means some alphabets are extra which not used and return false .
        if(hash[i] != 0) return false ;
    }
    return true ;
    }
}
