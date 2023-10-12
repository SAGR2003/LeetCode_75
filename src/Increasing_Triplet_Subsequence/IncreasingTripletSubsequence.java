package Increasing_Triplet_Subsequence;

import java.util.Arrays;

public class IncreasingTripletSubsequence {
    public static void main(String[] args){
        new IncreasingTripletSubsequence();
    }

    public IncreasingTripletSubsequence(){
//        int[] test = new int[]{1,2,3,4,5};
        int[] test = new int[]{5,4,3,2,1};
//        int[] test = new int[]{2,1,5,0,4,6};
//        int[] test = new int[]{20,100,10,12,5,13};
        System.out.println(increasingTriplet(test));
    }

    public boolean increasingTriplet(int[] nums) {
        int num1 = Integer.MAX_VALUE;
        int num2 = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n <= num1) num1 = n;
            else if (n <= num2) num2 = n;
            else return true;
        }
        return false;
    }
}
