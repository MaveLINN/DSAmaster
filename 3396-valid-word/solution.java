class Solution {
    public boolean isValid(String word) {
        
        if(word.length() < 3) return false;
        boolean isVowel = false , isConsonant = false ;
        char[] c = word.toCharArray();
        for(int i = 0 ; i < c.length ; i++){

            if((c[i] > 47 && c[i] < 58) || (c[i] > 64 && c[i] < 91) || (c[i] > 96 && c[i] < 123)){
                if((c[i] > 64 && c[i] < 91) || (c[i] > 96 && c[i] < 123)){
                    if(c[i] == 'a' || c[i] == 'e' ||c[i] == 'i' ||c[i] == 'o' ||c[i] == 'u' || c[i] == 'A' ||c[i] == 'I' ||c[i] == 'O' ||c[i] == 'U' ||c[i] == 'E' )isVowel = true ;
                    else isConsonant = true ;
                }            
            }
            else return false ;

        }
        return isVowel && isConsonant ? true : false ;
    }
}
