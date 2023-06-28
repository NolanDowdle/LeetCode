class Solution {
    public int removeDuplicates(int[] nums) {
        int backPointer = 0;
        for(int i = 0; i < nums.length; i++) {
            if(!containsTwice(nums, nums[i], backPointer)) {
                nums[backPointer] = nums[i];
                backPointer++;
            }
        }
        return backPointer;
    }

    public boolean containsTwice(int[] arr, int target, int pointer) {
        int containCounter = 0;
        for(int i = 0; i < pointer; i++) {
            if(arr[i] == target) {
                containCounter++;
            }
            if(containCounter == 2) {
                return true;
            }
        }
        return false;
    }
}
