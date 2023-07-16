class Solution {
    public int minOperations(String[] logs) {
        int stepsAway = 0;
        for(int i = 0; i < logs.length; i++) {
            if(logs[i].equals("../")) {
                if(stepsAway == 0) {
                    continue;
                }
                stepsAway--;
            } else if (logs[i].equals("./")) {
                continue;
            } else {
                stepsAway++;
            }
        }
        return stepsAway;
    }
}
