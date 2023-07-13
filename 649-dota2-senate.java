class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Character> banned = new LinkedList<>();
        for(int i = 0; i < senate.length(); i++) {
            if(i == senate.length()-1) {
                if(banned.size() == 0) {
                    if(senate.charAt(i) == 'R') {
                        return "Radiant";
                    } else if(senate.charAt(i) == 'D') {
                        return "Dire";
                    } else {
                        System.out.println("Error: wrong character");
                    }
                } else {
                    if(banned.peek() == 'R') {
                        return "Dire";
                    } else if (banned.peek() == 'D') {
                        return "Radiant";
                    } else {
                        return "Error";
                    }
                }
            } else {
                if(banned.size() == 0) {
                    // when no currently banned voters
                    if(senate.charAt(i) == 'R') {
                        banned.add('D');
                    } else if(senate.charAt(i) == 'D') {
                        banned.add('R');
                    } else {
                        System.out.println("Error: wrong character");
                    }
                } else {
                    // some banned voters
                    if(banned.peek() == 'R' && senate.charAt(i) == 'R') {
                        // case R voter and R in ban list, so remove from ban and
                        // go next character
                        banned.remove();
                        continue;
                    } else if (banned.peek() == 'D' && senate.charAt(i) == 'D') {
                        banned.remove();
                        continue;
                    } else if (banned.peek() == 'R' && senate.charAt(i) == 'D') {
                        banned.add('R');
                    } else if (banned.peek() == 'D' && senate.charAt(i) == 'R') {
                        banned.add('R');
                    }
                }
            }
        }
        return "Error";
    }
}
