class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;
        int res = 0;
        for (int pile : piles){
            r = Math.max(pile, r);
        }

        while(l <= r){
            int m = l + (r-l)/2;
            if(correct(piles, h, m)){
                res = m;
                r = m - 1;
            } else l = m + 1;
        }
        return res;
    }

    public boolean correct(int[] piles, int h, int guess){
        long num = 0;
        for(int pile : piles){
            num += (pile + guess - 1)/guess;
        }
        return num <= h;
    }
}
