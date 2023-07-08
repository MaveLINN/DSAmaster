class Solution {
    public int maxArea(int[] height) {
        int n = height.length ;
        int l = 0 , r = n-1 ;
        int res = 0 ;
        while(l < r){          
            res = Math.max(Math.min(height[l],height[r])*(r-l),res);
            if(height[l] > height[r])r--;
            else l++;
        }
        return res ;
    }
}

