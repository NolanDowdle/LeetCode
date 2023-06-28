class Solution {
    public int maximumWealth(int[][] accounts) {
        int highestValue = 0;
        for(int i = 0; i < accounts.length; i++) {

            int customerSum = 0;
            // sum values for this customer
            for(int j = 0; j < accounts[i].length; j++) {
                customerSum += accounts[i][j];
            }

            // compare to see if this is the highest value so far
            if(i == 0) {
                highestValue = customerSum;
            } else {
                // set new highest value to this customers sum
                if(customerSum > highestValue) {
                    highestValue = customerSum;
                }
            }
        }
        return highestValue;
    }
}
