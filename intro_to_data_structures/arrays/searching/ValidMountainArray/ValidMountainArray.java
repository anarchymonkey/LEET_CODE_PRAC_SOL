public class ValidMountainArray {
    
    public static boolean  isArrayStrictlyIncreasing(int [] arr, int pivotIndex) {
        boolean isIncreasing = false;
        if (pivotIndex == 0) {
            return true;
        }
        for (int i = 0; i < pivotIndex; i++) {
            if (arr[i] < arr[i + 1]) {
                isIncreasing = true;
            } else {
                return false;
            }
        }
        
        return isIncreasing;
    }
    
    public static boolean isArrayStrictlyDecreasing(int [] arr, int pivotIndex) {
        if (pivotIndex == arr.length - 1) {
            return true;
        }
        
        boolean isDecreasing = false;
        
        for (int i = pivotIndex; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isDecreasing = true;
            } else {
                return false;
            }
        }
        
        return isDecreasing;
    }
    
    public static boolean validMountainArray(int[] arr) {
        int pivotIndex = 0;
        
        if (arr.length < 3) {
            return false;
        }
        
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] == arr[i - 1] || arr[i] == arr[i + 1]) {
                pivotIndex = -1;
                return false;
            }
            
            if (arr[i] < arr[i - 1]) {
                pivotIndex = i;
                break;
            }
            
            if (arr[i] > arr[i + 1]) {
                pivotIndex = i;
                break;
            }
        }
        
        boolean isStrictlyIncreasing = isArrayStrictlyIncreasing(arr, pivotIndex);
        boolean isStrictlyDecreasing = isArrayStrictlyDecreasing(arr, pivotIndex);

        return isStrictlyIncreasing & isStrictlyDecreasing;
    }
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4, 5, 3, 2, 1 };

        System.out.println("Is this a valid mountain array? -> " + validMountainArray(arr) );
    }
}
