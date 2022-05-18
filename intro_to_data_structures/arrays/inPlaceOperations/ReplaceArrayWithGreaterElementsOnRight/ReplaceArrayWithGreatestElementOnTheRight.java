import java.util.Arrays;

/**
 * ReplaceArrayWithGreatestElementOnTheRight
 */
public class ReplaceArrayWithGreatestElementOnTheRight {

    public static int[] replaceElements(int[] arr) {
        // the max value initially is -1, as mentioned in the problem statement
        int maxSeenSoFar = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            /*
             * to cut down on the operations we can see that
             * if we go backwards and then iterate through the array by keeping max of each
             * iteration, then we can discard all the repeated steps
             * 
             */
            // keep track of the current value
            int temp = arr[i];
            // replace the current element position with the new max element
            arr[i] = maxSeenSoFar;
            // recompute the max for the next iterations
            maxSeenSoFar = Math.max(maxSeenSoFar, temp);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 17, 18, 5, 4, 6, 1 };
        replaceElements(arr);
        System.out.println("The replaced array is " + Arrays.toString(arr));
    }
}