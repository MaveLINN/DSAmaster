class Solution {

    int hs[] = new int[501];
    public int findLucky(int[] arr) {
        for(int i = 0 ; i < arr.length ; i++){
            hs[arr[i]]++;
        }
        int mx = -1 ;
        for(int i = 1 ; i < 501 ; i++){
            if(i == hs[i]){
                mx = i ;
            }
        }
        return mx ;
    }
}
