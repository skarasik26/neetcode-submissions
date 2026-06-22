// Definition for a pair.
// class Pair {
//     int key;
//     String value;
//
//     public Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
class Solution {
    public List<Pair> quickSort(List<Pair> pairs) {
        if(pairs.size() <= 1) return pairs;

        Pair pivot = pairs.get(pairs.size() - 1);

        int left = 0;

        for (int i = 0; i < pairs.size() - 1; i++){
            if(pairs.get(i).key < pivot.key){
                Pair temp = pairs.get(left);
                pairs.set(left, pairs.get(i));
                pairs.set(i, temp);
                left++;
            }
        }
        pairs.set(pairs.size() - 1, pairs.get(left));
        pairs.set(left,pivot);
        quickSort(pairs.subList(0, left));
        quickSort(pairs.subList(left + 1, pairs.size()));
        return pairs;

    }
}
