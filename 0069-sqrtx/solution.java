class Solution {
    public int mySqrt(int x) {

        long check = 0 ;
        while(check*check <= (long)x){
            check++ ;
        }
    return (int)check-1;
    }
}
