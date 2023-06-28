class Solution {
    public int numberOfSteps(int num) {
        int stepsCounter = 0;
        while(num > 0) {
            if((num%2) == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            stepsCounter += 1;
        }
        return stepsCounter;
    }
}
