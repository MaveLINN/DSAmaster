class Solution {
    public int[] plusOne(int[] digits) {
        
        int n = digits.length ;
        for(int i = n - 1 ; i >= 0 ; i--){
            if(digits[i] != 9){  // this is bydefault adding +1 , and if not equal to 9 just return the array .
                digits[i] += 1 ;
                break;
            }else digits[i] = 0 ; // carry to next as value is 9 .
        }

        if(digits[0] == 0){ // this conditionis is for when the each value of array is 9 , means the first value is also 9 . Then we need to add 1 at the first place and rest other zeroes .
            int[] res = new int[n+1];
            res[0] = 1 ;
            return res ;
        }   

        
        return digits ;

    }
}
