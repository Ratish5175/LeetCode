package DP;

import java.util.Arrays;

public class ReducingDishes {
    public static void main(String[] args) {
        int[] satisfaction = {-1, -8, 0, 5, -9};
        ReducingDishes reducingDishes = new ReducingDishes();
        System.out.println(reducingDishes.maxSatisfaction(satisfaction));

    }

    public int maxSatisfaction(int[] satisfaction) {
        int res = 0;
        int max = 0;
        Arrays.sort(satisfaction);
        int sum = 0;
        int n = satisfaction.length;
        for (int i = n - 1; i >= 0; i--) {
            res += satisfaction[i];
            sum += res;
            max = Math.max(sum, max);
        }
        return max;
    }
}
