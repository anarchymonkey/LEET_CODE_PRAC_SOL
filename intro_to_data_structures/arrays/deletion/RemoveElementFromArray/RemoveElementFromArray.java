/**
 * RemoveElementFromArray
 */
public class RemoveElementFromArray {
    public static void print(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " - ");
        }
    }

    public static int removeDuplicates(int[] nums) {

        // take the right pointer

        int right = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            // if we find distinct values, keep on pushing them at the right index

            if (nums[i] != nums[i + 1]) {
                nums[right++] = nums[i];
            }
        }

        // the code breaks before we have passed through the last element, thus this step

        nums[right++] = nums[nums.length - 1];

        return right;
    }
    
    public static void main(String[] args) {
        int[] nums = { 0, 0, 0, 0, 1, 1, 1, 1, 2, 3 };
        int lenToPrint = removeDuplicates(nums);

        print(nums, lenToPrint);

    }
}