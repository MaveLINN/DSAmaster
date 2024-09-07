class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int countZero = 0, mulValue = 1, lastZeroIndex = -1;
        int[] pre = new int[n+1]; pre[0] = 1 ;
        int[] suf = new int[n+1]; suf[n] = 1 ;

        for (int i = 0; i < nums.length; i++) {
            pre[i+1]= pre[i]*nums[i];
            suf[n-1-i] = suf[n-i]*nums[n-i-1];
            if (nums[i] == 0) {
                countZero++;
                lastZeroIndex = i;
            } else {
                mulValue *= nums[i];
            }
        }

        if (countZero > 1) {
            Arrays.fill(nums, 0);
            return nums;
        } else if (countZero == 1) {
            Arrays.fill(nums, 0);
            nums[lastZeroIndex] = mulValue;
        } else {
            for (int i = 0; i < n; i++) {
                nums[i] = pre[i]*suf[i+1];
            }
        }
        return nums;
    }
}
