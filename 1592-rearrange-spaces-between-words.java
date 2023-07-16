class Solution {
    public String reorderSpaces(String text) {
        if(text.length() <= 1) {
            return text;
        }
        int spaceCounter = 0;
        for(int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == ' ') {
                spaceCounter++;
            }
        }
        String tempString = text;
        for(int i = 0; i < text.length(); i++) {
            if(text.charAt(i) != ' ') {
                tempString = text.substring(i);
                break;
            }
        }

        String newString = "";
        String[] oldTextWords = tempString.split("\\s+");
        int spacesPerWord = spaceCounter / (oldTextWords.length);
        if(oldTextWords.length > 1) {
            spacesPerWord = spaceCounter / (oldTextWords.length-1);
        }
        for(int i = 0; i < oldTextWords.length; i++) {
            newString += oldTextWords[i];
            if(i != oldTextWords.length-1) {
                for(int j = 0; j < spacesPerWord; j++) {
                    newString += " ";
                }
            }
        }
        int leftOver = spaceCounter;
        if(oldTextWords.length > 1) {
            leftOver = spaceCounter % (oldTextWords.length-1);
        }
        for(int i = 0; i < leftOver; i++) {
            newString += " ";
        }

        return newString;
    }
}
