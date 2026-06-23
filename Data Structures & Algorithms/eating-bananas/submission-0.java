class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;
        for (int pile : piles) {
            r = Math.max(r, pile);
        }
        int m;
        int currMin = Integer.MAX_VALUE;
        while(l <= r){
            m = l + (r-l)/2;
            if(!correct(piles, h, m)){
                l = m + 1;
            } else{
                if(m < currMin) currMin = m;
                r = m - 1;
            }
        }
        return currMin;
    }
    public boolean correct(int[] piles, int h, int guess){
        long num = 0;
        for(int i = 0; i<piles.length; i++){
            if(piles[i] % guess !=0){
                num+=piles[i]/guess + 1;
            } else num+=piles[i]/guess;
        }
        return num <= h;
    }
}
