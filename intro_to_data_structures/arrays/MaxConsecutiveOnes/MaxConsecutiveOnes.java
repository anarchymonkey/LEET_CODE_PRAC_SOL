class MaxConsecutiveOnes {

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " - ");
        }
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxOnes = 0;
        // 1 1 1 0 0 1 0 1 1 1
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            // keep on getting the max value between maxOnes & currentCount;
            maxOnes = Math.max(maxOnes, count);
        }
        return maxOnes;
    }
    public static void main(String[] args) {
        int[] test_A = { 1, 1, 1, 0, 0, 0, 1, 1, 1 };
        int[] test_B = { 1, 1, 0 };
        int[] test_C = { 0, 0, 0, 0 };
        System.out.println("The max consecutive ones for test_A are ==> " + findMaxConsecutiveOnes(test_A));
        System.out.println("The max consecutive ones for test_B are ==> " + findMaxConsecutiveOnes(test_B));
        System.out.println("The max consecutive ones for test_C are ==> " + findMaxConsecutiveOnes(test_C));
    }
}