import java.util.Arrays;

public class MoveZerosToEnd {
    public static void moveZeroes(int[] nums) {
        int writePointer = 0;
        
        // If a non zero element is found, push it into the start of the array
        // This approach maintains the order of the elements also
            
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[writePointer++] = nums[i];
            }    
        }
        
        // write pointer gives the no of non zero elements
        // if we insert 0's considering that the writePointer stopped after counting the non zero elements
        // then we will have our array
        for(int i = writePointer; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 0, 0, 2, 0, 0, 3 };
        moveZeroes(arr);
        System.out.println("The array after moving 0's inplace is" + Arrays.toString(arr));
    }
}
