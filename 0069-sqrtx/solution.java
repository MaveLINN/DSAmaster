class Solution {
    public int mySqrt(int x) {

    long gg = 0 , res = 0 ; 

    while(gg*gg <= (long)x){
        gg++;
    }
    return (int)gg - 1 ;
    }
}
