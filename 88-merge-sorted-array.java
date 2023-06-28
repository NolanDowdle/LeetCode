class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int num1Pointer = 0;
        int num2Pointer = 0;
        int[] newArray = new int[m+n];
        for(int i = 0; i < m+n; i++) {
            if(num1Pointer == m) {
                newArray[i] = nums2[num2Pointer];
                num2Pointer++;
            } else if (num2Pointer == n) {
                newArray[i] = nums1[num1Pointer];
                num1Pointer++;
            } else {
                if(nums1[num1Pointer] < nums2[num2Pointer]) {
                    newArray[i] = nums1[num1Pointer];
                    num1Pointer++;
                } else {
                    newArray[i] = nums2[num2Pointer];
                    num2Pointer++;
                }
            }
        }

        for(int i = 0; i < m+n; i++) {
            nums1[i] = newArray[i];
        }
    }
}
