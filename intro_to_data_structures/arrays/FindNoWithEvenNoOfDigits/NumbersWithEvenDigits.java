public class NumbersWithEvenDigits {

    public static int countDigitsInNum(int num) {
        
        if (num == 0) {
            return 0;
        }
        
        return 1 + countDigitsInNum(num / 10);
    } 
    
    public static boolean isEven (int number) {
        return number % 2 == 0;
    }
    
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isEven(countDigitsInNum(nums[i]))) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 24, 356, 26, 7212 };

        System.out.println("The answer for find numbers => " + findNumbers(arr));
    }
}
