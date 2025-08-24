class Solution {
    public int maximumCount(int[] nums) {
        long x = Arrays.stream(nums).filter(i -> i < 0).count();
        long y = Arrays.stream(nums).filter(i -> i > 0).count();
        return (int)Math.max(x,y);
    }
}
