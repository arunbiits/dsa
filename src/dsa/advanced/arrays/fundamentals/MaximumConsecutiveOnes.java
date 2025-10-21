package dsa.advanced.arrays.fundamentals;

/**
 * Maximum Consecutive Ones
 * Time Complexity - O(n)
 * Space Complexity - O(1)
 */
public class MaximumConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, count = 0;
        for(int num: nums) {
            if(num == 1) {
                count++;
                max = Math.max(max, count);
            }else {
                count = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 1, 1, 0};
        MaximumConsecutiveOnes mco = new MaximumConsecutiveOnes();
        System.out.println(mco.findMaxConsecutiveOnes(arr));
    }
}
