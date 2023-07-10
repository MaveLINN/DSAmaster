class Solution {
    public boolean closeStrings(String word1, String word2) {

        int[] has1 = new int[26];
        int[] has2 = new int[26];
        for(int i = 0 ; i < word1.length() ; i++){
            has1[(int)word1.charAt(i) - 97]++;
        }
        for(int i = 0 ; i < word2.length() ; i++){
            has2[(int)word2.charAt(i) - 97]++;
        }

        for(int i = 0 ; i < 26 ; i++){
            if(has1[i] > 0 && has2[i] != 0){
                int ct = has1[i] ;
                boolean mila = false ;
                for(int j = 0 ; j < 26 ; j++){
                    if(has2[j] == ct){ mila = true ; has2[j] = -1 ; break ; }
                }

                if(mila == false) return false ;
            }
            else if(has1[i] > 0 && has2[i] == 0) return false ;
            else if(has1[i] == 0 && has2[i] != 0) return false ;
        }


        return true ;
        
    }
}


/*

a

m1       m2


a - 2   a = 1
b - 3   b = 2
c - 1   c = 3

*/
