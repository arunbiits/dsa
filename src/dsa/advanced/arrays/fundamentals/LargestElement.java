package dsa.advanced.arrays.fundamentals;

/**
 * Find the largest element in an array
 * Time Complexity - O(n)
 * Space Complexity - O(1)
 */
public class LargestElement {
    public int largestElement(int[] nums) {
        int max = nums[0];
        for(int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,8,0,2,9};
        LargestElement le = new LargestElement();
        System.out.println(le.largestElement(arr));
    }
}
