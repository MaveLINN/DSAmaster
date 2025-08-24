class Solution {
    public int trap(int[] height) {
        int n = height.length ;

        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        int[] rightMax = new int[n];
        rightMax[n-1] = height[n-1];

        IntStream.range(1,n).forEach( i -> leftMax[i] = Math.max(leftMax[i-1],height[i]) );
        IntStream.range(0,n-1).map(i-> n-i-2).forEach(i-> rightMax[i] = Math.max(rightMax[i+1],height[i]));
        return IntStream.range(0,n).map(i-> Math.abs(Math.min(leftMax[i],rightMax[i]) - height[i])).sum();
    }
}
