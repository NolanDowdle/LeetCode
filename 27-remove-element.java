class Solution {
    public int removeElement(int[] nums, int val) {
        int[] newArr = new int[nums.length];
        int counter = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                newArr[counter] = nums[i];
                counter++;
            }
        }
        for(int i = 0; i < newArr.length; i++) {
            nums[i] = newArr[i];
        }
        return counter;
    }
}
