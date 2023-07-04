/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        int num = right+left/2;
        int found = guess(num);
        while(found != 0) {
            if(found == -1) {
                right = (right+left)/2;
            } else if (found == 1) {
                left = num;
            } else if (found == 0) {
                return num;
            }
            num = (right+left)/2;
            found = guess(num);
        }
        return num;
    }
}
