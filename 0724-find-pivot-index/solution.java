class Solution {
    public int pivotIndex(int[] nums) {

        int n = nums.length ;
        int[] pre = new int[n+1];
        int Lsum = 0 , sum = 0 ;
        pre[n] = 0 ;

        int res = -1 ;
        for(int i = n-1 ; i >= 0 ; i--){
            sum += nums[i];
            pre[i] = sum ;
        }

        for(int i = 0 ; i < n + 1 ; i++)
        System.out.print(pre[i] + "  ");

        for(int i = 0 ; i < n ; i++){
           if(Lsum == pre[i+1]){
           res = i ; break ;
           }
           Lsum += nums[i];
        }
        
        return res ;
    }
}

/*
        0     1     2     3     4     5    6
        1     7     3     6     5     6    
       28    27    20    17    11     6    0

*/


