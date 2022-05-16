import java.util.Arrays;

public class SquaresOfSortedArrays {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] sortedSquares(int[] nums) {
        // step 1 -> square array
        
        for (int i = 0; i < nums.length ; i++) {
            nums[i] = Math.abs(nums[i] * nums[i]);
        }
        
        // step 2 -> sort array
        
        Arrays.sort(nums);
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, -4, -5, -25 };

        print(sortedSquares(nums));
    }
}
