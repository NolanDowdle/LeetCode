class Solution {
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        for(int i = 0; i < words.length; i++) {
            for(int j = 0;j < words[i].length(); j++) {
                if(j > s.length()-1) {
                    break;
                }
                if(words[i].charAt(j) != s.charAt(j)) {
                    break;
                } else {
                    if(j == words[i].length()-1) {
                        System.out.println(words[i]);
                        count += 1;
                    }
                }
            }
        }
        return count;
    }
}
