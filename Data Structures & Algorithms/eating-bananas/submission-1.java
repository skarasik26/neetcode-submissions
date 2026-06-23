class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;
        for (int pile : piles) {
            r = Math.max(r, pile);
        }
        int m;
        int currMin = 0;
        while(l <= r){
            m = l + (r-l)/2;
            if(!correct(piles, h, m)){
                l = m + 1;
            } else{
                currMin = m;
                r = m - 1;
            }
        }
        return currMin;
    }
    public boolean correct(int[] piles, int h, int guess){
        long num = 0;
        for(int i = 0; i<piles.length; i++){
            num+=(piles[i] + guess - 1)/guess;
        }
        return num <= h;
    }
}
