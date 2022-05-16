/**
 * RemoveElement
 */
public class RemoveElement {
    public static void print(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " - ");
        }
    }

    public static int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 3, 4, 5 };
        int valToRemove = 2;

        int n = removeElement(nums, valToRemove);
        print(nums, n);
    }
}