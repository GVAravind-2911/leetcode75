import java.util.*;

class KidsWithCandies1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Integer> arr = new ArrayList<>();
        int largest = candies[0];
        for (int candy : candies) {
            arr.add(candy);
            if (candy>largest){
                largest = candy;
            }
        }

        List<Boolean> outp = new ArrayList<>();
        for (int i : arr) {
            outp.add((i + extraCandies) >= largest);
        }

        return outp;
    }
}
