class Solution {
    public int[] twoSum(int[] nums, int target) {
        int num1;
        int num2;
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(nums[i] + nums[j] == target && i != j) {
                    int[] array = new int[]{i, j};
                    return array;
                }
            }
        }
        return null;
    }
}
