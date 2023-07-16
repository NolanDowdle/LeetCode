class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int index = -1;
        String[] words = sentence.split(" ");
        int count = 1;
        for(String word: words) {
            if(word.startsWith(searchWord)) {
                return count;
            }
            count++;
        }
        return index;
    }
}
