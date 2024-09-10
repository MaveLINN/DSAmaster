class Solution {
    public static int maxArea(int[] height) {
        int n = height.length;
        int res = 0 ;
        int l = 0 , r = n - 1 ;

        while(l < r){
            res = Math.max(Math.min(height[l],height[r])*Math.abs(l-r) , res );
            if(height[l] < height[r]) l++;
            else r--;
        }
        return res ;
    }
}
