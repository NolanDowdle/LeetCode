class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 1;
        int minSize = Integer.MAX_VALUE;
        int sum = nums[left];
        if(nums.length > 1) {
            if(nums[left] > target) {
                return 1;
            }
            sum = nums[left] + nums[right];
        } else {
            if(nums[left] > target) {
                return nums.length;
            } else {
                return 0;
            }
        }
        while(right < nums.length) {
            if(sum < target) {
                right += 1;
                if(right == nums.length) {
                    break;
                }
                sum += nums[right];
            } else {
                if(minSize > right-left+1) {
                    minSize = right-left+1;
                }
                sum -= nums[left];
                left += 1;
            }
        }
        if(minSize == Integer.MAX_VALUE) {
            return 0;
        } else {
            return minSize;
        }
    }
}
