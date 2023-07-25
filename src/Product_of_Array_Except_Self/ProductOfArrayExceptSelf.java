package Product_of_Array_Except_Self;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        new ProductOfArrayExceptSelf();
    }

    public ProductOfArrayExceptSelf() {
//        int[] test = new int[]{0, 0};
        int[] test = new int[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(test)));
    }

    public int[] productExceptSelf(int[] nums) {
        int [] answer = new int[nums.length];
        int leftProduct = 1;
        int rightProduct = 1;

        for (int number = 0; number < nums.length; number++) {
            answer[number] = leftProduct;
            leftProduct *= nums[number];
        }

        for (int number = nums.length - 1; number >= 0; number--) {
            answer[number] *= rightProduct;
            rightProduct *= nums[number];
        }

        return answer;
    }
}
