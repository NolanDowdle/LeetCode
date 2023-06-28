class Solution {
    public int removeDuplicates(int[] nums) {
        int[] arr = new int[nums.length];
        int counter = 0;
        int zeroCounter = 0;

        for(int i = 0; i < nums.length; i++) {
            if(!contains(arr, nums[i]) || nums[i] == 0) {
                if(nums[i] == 0 && zeroCounter == 1) {
                    continue;
                } else {
                    arr[counter] = nums[i];
                    counter++;
                    if(nums[i] == 0 && zeroCounter != 1) {
                        zeroCounter++;
                    }
                }
            }
        }

        // set nums array to the temporary array
        for(int i = 0; i < counter; i++) {
            nums[i] = arr[i];
        }
        return counter;
    }

    public boolean contains(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return true;
            }
        }
        return false;
    }
}
