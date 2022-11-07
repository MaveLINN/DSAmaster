class Solution {
    public int firstUniqChar(String s) {
        
    int[] has = new int[26] ; // hashing array upto 26 characters 
    for(int i = 0 ; i < s.length() ; i++){
        has[(int)s.charAt(i) - 97]++;   // hashed values saved at location
    }

    for(int i = 0 ; i < s.length() ; i++){
        if(has[(int)s.charAt(i) - 97] == 1)return i ; // checking if the hashed values is 1 , it means the occurence is 1 . Moving forward if the hashed value is 1, return that index looping in string . 
    }
    return -1 ; // not found . so return -1 .

    }
}
