class Solution {
    public int trap(int[] a) {
        int n = a.length ;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = a[0];
        rightMax[n-1] = a[n-1];

        for(int i = 1 ; i < n ; i++){
            leftMax[i] = Math.max(leftMax[i-1],a[i]);
        }

        for(int i = n - 2 ; i > -1 ; i--){
            rightMax[i] = Math.max(rightMax[i+1],a[i]);
        }

        int final_water_Stored = 0 ;
        for (int i = 0 ; i < n ; i++){
            final_water_Stored += Math.abs( Math.min(leftMax[i],rightMax[i]) - a[i]);
        }
        return final_water_Stored ;
    }
}
