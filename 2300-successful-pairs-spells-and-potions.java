class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] pairs = new int[spells.length];
        Arrays.sort(potions);
        for(int i = 0; i < spells.length; i++) {
            int l = 0;
            int r = potions.length-1;
            while(l <= r) {
                int mid = l + (r-l)/2;
                if((long)spells[i] * potions[mid] >= success) {
                    r = mid-1;
                } else {
                    l = mid+1;
                }
            }
            pairs[i] = potions.length-l;
        }
        return pairs;
    }
}
