class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> list = new ArrayList<String>();
        if(nums.length == 1 || nums.length == 0) {
            if(nums.length == 1) {
                list.add(Integer.toString(nums[0]));
            }
            return list;
        }
        int startRange = nums[0];
        int endRange = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(i == nums.length-1) {
                if(i == 1) {
                    if(nums[0] == nums[1] - 1) {
                        String add = nums[0] + "->" + nums[1];
                        list.add(add);
                    } else {
                        list.add(Integer.toString(nums[0]));
                        list.add(Integer.toString(nums[1]));
                    }
                    return list;
                }

                endRange = nums[i];
                if(startRange == endRange) {
                    list.add(Integer.toString(startRange));
                } else {
                    String add = startRange + "->" + endRange;
                    list.add(add);
                }
                return list;
            }


            if(nums[i-1] == nums[i] - 1) {
                // continue counting range
                if(nums[i] != nums[i+1] - 1) {
                    endRange = nums[i];
                    String add = startRange + "->" + endRange;
                    list.add(add);
                    startRange = nums[i+1];
                    endRange = nums[i+1];
                }
            } else {
                if(i == 1) {
                    // special case when 0 is only one in range
                    if(nums[0] == nums[i] - 1) {
                        continue;
                    } else {
                        list.add(Integer.toString(startRange));
                        startRange = nums[i+1];
                        endRange = nums[i+1];
                    }
                }

                // start counting range
                if(nums[i] == nums[i+1] - 1) {
                    startRange = nums[i];
                    endRange = nums[i];
                    continue;
                } else {
                    // end range and add to list
                    if(startRange == endRange) {
                        list.add(Integer.toString(startRange));
                        startRange = nums[i+1];
                        endRange = nums[i+1];
                    } else {
                        String add = startRange + "->" + endRange;
                        list.add(add);
                        startRange = nums[i+1];
                        endRange = nums[i+1];
                    }
                }
            }
        }
        return list;
    }
}
