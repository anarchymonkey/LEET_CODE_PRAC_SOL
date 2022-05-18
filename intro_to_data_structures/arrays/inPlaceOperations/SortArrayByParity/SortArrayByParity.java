import java.util.Arrays;

public class SortArrayByParity {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int[] sortArrayByParity(int[] nums) {

        int oddPointer = 0;
        int evenPointer = nums.length - 1;

        while (oddPointer < evenPointer) {

            // if oddPointer element is odd & evenPointer element is even, we need to swap places
            if (!isEven(nums[oddPointer]) && isEven(nums[evenPointer])) {
                int temp = nums[oddPointer];
                nums[oddPointer] = nums[evenPointer];
                nums[evenPointer] = temp;
                // once swapping is finished, we need to move oddPointer ahead and evenPointer back, as we do not want recalculations of the same indices.
                oddPointer++;
                evenPointer--;
            }

            // if the odd pointer is even, we need to move ahead by one
            if (isEven(nums[oddPointer])) {
                oddPointer++;
            }

            // if the evenPointer is odd, move back by one
            if (!isEven(nums[evenPointer])) {
                evenPointer--;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 4, 2, 0 };

        sortArrayByParity(arr);
        System.out.println("Sorting array by parity" + Arrays.toString(arr));
    }

}
