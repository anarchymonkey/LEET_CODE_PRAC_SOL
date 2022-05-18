import java.util.Arrays;

public class RemoveDupFromSortedArray {

    public static int removeDuplicates(int[] nums) {

        // take the right pointer

        int right = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            // if we find distinct values, keep on pushing them at the right index

            if (nums[i] != nums[i + 1]) {
                nums[right++] = nums[i];
            }
        }

        // the code breaks before we have passed through the last element, thus this
        // step

        nums[right++] = nums[nums.length - 1];

        return right;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

        removeDuplicates(arr);
        System.out.println("Array after removing duplicates in place is => " + Arrays.toString(arr));
    }
}
