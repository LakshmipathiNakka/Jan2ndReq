import java.util.*;

public class Solution {
    
    public static void computeProductArray(int size, int[] nums, int[] result) {
       int totalProduct = 1, zeroCount = 0;

        // Compute total product and count zeros
        for (int num : nums) {
            if (num != 0) totalProduct *= num;
            else zeroCount++;
        }

        for (int i = 0; i < size; i++) {
            if (zeroCount > 1) result[i] = 0; // More than one zero, all products are zero
            else if (nums[i] == 0) result[i] = totalProduct; // Current element is zero, result is the total product
            else if (zeroCount == 1) result[i] = 0; // One zero, other elements are zero
            else result[i] = totalProduct / nums[i]; // Regular case, divide by current element
        }
        
    }
}
