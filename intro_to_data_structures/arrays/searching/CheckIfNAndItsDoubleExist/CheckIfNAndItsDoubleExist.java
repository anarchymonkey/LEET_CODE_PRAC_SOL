/**
 * CheckIfNAndItsDoubleExist
 */
import java.util.HashMap;
public class CheckIfNAndItsDoubleExist {
    public static boolean checkIfExist(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < arr.length; i++) {
            
            // check weither the hashmap contains both conditions (A = B/2) or (B = 2 * A)
            if (map.containsKey(arr[i] * 2)) {
                return true;
            }
            
            if (arr[i] % 2 == 0) {
                if (map.containsKey(arr[i] / 2)) {
                    return true;
                }
            }
            
            map.put(arr[i], i);
        }
        
        return false;
    }
    public static void main(String[] args) {
        int[] arr = { 10, 2, 5, 3 };
        System.out.println("Does the N and It's double exist => " + checkIfExist(arr));
    }
}