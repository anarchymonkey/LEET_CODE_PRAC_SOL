/**
 * MergeSortedArray
 */
public class MergeSortedArray {

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " - ");
        }
    }

    public static void shiftRight(int[] arr, int size, int elementToInsert, int positionToInsert) {

        for (int i = size - 2; i >= positionToInsert; i--) {
            arr[i + 1] = arr[i];
        }

        arr[positionToInsert] = elementToInsert;
    }
    
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        
        // set the index of second array as 0
        int j = 0;
        
        for (int i = 0; i < m + n; i++) {
            // if the second array index reaches it's end then break the loop
            if (j == n) {
                break;
            }
            // if the first array contains some element greater than the second array then insert the second array element in place of that first array element index and shift rest to the right
            if (nums1[i] > nums2[j]) {
                shiftRight(nums1, m + n, nums2[j], i);
                
                // once one element is inserted into the first array, move on to the second element as we can assume that in an sorted array the previous elements will always be lesser than the current element
                j++;
            }
        }
        // rest of the elements will be the greatest elements which will be left over, thus insert them into the first array
        if (j < n) {
            for (int i = m + j; i < m + n; i++) {
                nums1[i] = nums2[j++];
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] arr2 = { 2, 5, 6 };
        int n = arr2.length;

        merge(arr1, m, arr2, n);

        System.out.println("The value after merging is");
        print(arr1);

        
        
    }    
}