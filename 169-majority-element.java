class Solution {
    public int majorityElement(int[] nums) {
       HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
       for(int i = 0; i < nums.length; i++) {
           if(hash.containsKey(nums[i])) {
               hash.put(nums[i], (hash.get(nums[i]) + 1));
           } else {
               hash.put(nums[i], 1);
           }
       }

       for(int i = 0; i < nums.length; i++) {
           if(hash.get(nums[i]) > (nums.length/2)) {
               return nums[i];
           }
       }
       return 0;
    }
}
