class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<String>(); 
        for(int i = 1; i < n+1; i++) {
            if((i%3) == 0 && (i%5) == 0) {
                answer.add(i-1, "FizzBuzz");
            } else if ((i%3) == 0) {
                answer.add(i-1, "Fizz");
            } else if ((i%5) == 0) {
                answer.add(i-1, "Buzz");
            } else {
                answer.add(i-1, String.valueOf(i));
            }
        }
        return answer;
    }
}
