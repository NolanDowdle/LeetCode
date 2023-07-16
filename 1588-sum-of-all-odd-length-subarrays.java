class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        if(arr.length < 1) {
            return 0;
        }
        int sum = 0;
        int windowSize = 1;
        while(windowSize <= arr.length) {
            for(int i = 0; i+windowSize <= arr.length; i++) {
                for(int j = 0; j < windowSize; j++) {
                    sum += arr[i+j];
                }
            }
            windowSize += 2;
        }
        return sum;
    }
}
