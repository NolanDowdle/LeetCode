class Solution {
    public boolean isSubsequence(String s, String t) {
        int rightPointer = t.length()-1;
        int leftPointer = 0;

        int sRight = s.length()-1;
        int sLeft = 0;

        if(s.length() == 0) {
            return true;
        } else if (t.length() == 0) {
            return false;
        }

        while(rightPointer >= leftPointer && rightPointer != 0) {
            if(sLeft == sRight) {
                if(t.charAt(rightPointer) == s.charAt(sRight) || 
                    t.charAt(leftPointer) == s.charAt(sLeft)) {
                    return true;
                } else {
                    leftPointer += 1;
                    rightPointer -= 1;
                }
            } else {
                if(s.charAt(sLeft) == t.charAt(leftPointer)) {
                    sLeft += 1;
                    leftPointer += 1;
                } else if (s.charAt(sRight) == t.charAt(rightPointer)) {
                    sRight -= 1;
                    rightPointer -= 1;
                } else {
                    leftPointer += 1;
                    rightPointer -= 1;
                }
            }
        }
        if(sRight < sLeft) {
            return true;
        } else {
            return false;
        }
    }
}
