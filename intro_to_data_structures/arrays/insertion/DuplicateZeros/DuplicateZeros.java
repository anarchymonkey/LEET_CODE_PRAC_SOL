/**
 * DuplicateZeros
 */
public class DuplicateZeros {

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " - ");
        }
    }
    public static void shiftRight(int[] arr, int n, int elementToInsert, int positionToInsertAt) {
    
        for (int i = n - 2; i >= positionToInsertAt; i--) {
            arr[i + 1] = arr[i];
        }
        
        arr[positionToInsertAt] = elementToInsert;
    }

    public static void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                // if it reaches the end then break away from the loop
                if (i == arr.length - 1) {
                    return;
                }
                // keep on adding 0 and shifting right
                shiftRight(arr, arr.length, 0, i + 1);
                // shifting right would mean that the iterator has moved to the next 0, we want to move to the next -> next iterator
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 0, 3, 0, 4 };
        duplicateZeros(arr);
        System.out.println("The duplicate zeros array is ");
        print(arr);
    }
    
}