package Kids_with_more_candies;

import java.util.ArrayList;
import java.util.List;

public class KidsWithMoreCandies {
    public static void main(String[] args) {
        new KidsWithMoreCandies();
    }

    public KidsWithMoreCandies() {
        int[] candies = new int[]{2, 3, 5, 1, 3};
        int[] candies2 = new int[]{4, 2, 1, 1, 2};
        int[] candies3 = new int[]{12, 1, 12};
        System.out.println(kidsWithCandies(candies, 3));
        System.out.println(kidsWithCandies(candies2, 1));
        System.out.println(kidsWithCandies(candies3, 1));
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> booleanList = new ArrayList<>();
        int maxCandies = greatestNumber(candies);
        for (int candy : candies) {
            boolean greatest = (candy + extraCandies) >= maxCandies;
            booleanList.add(greatest);
        }
        return booleanList;
    }

    private int greatestNumber(int[] candies) {
        int greatest = 0;
        for (int candy : candies)
            greatest = Math.max(greatest, candy);
        return greatest;
    }
}
