class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        for(int i = 0; i < ransomNote.length(); i++) {
            if(magazine.contains(String.valueOf(ransomNote.charAt(i)))) {
                //remove letter from magazine
                for(int j = 0; j < magazine.length(); j++) {
                    if(magazine.charAt(j) == ransomNote.charAt(i)) {
                        magazine = deleteCharAt(magazine, j);
                        break;
                    }
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public String deleteCharAt(String s, int j) {
        s = s.substring(0, j) + s.substring(j+1);
        return s;
    }
}
