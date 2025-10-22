package dsa.advanced.arrays.logical;

/**
 * Move Zeroes To End
 * Time Complexity - O(n)
 * Space Complexity - O(1)
 */
public class MoveZeroesToEnd {
    public void moveZeroes(int[] nums) {
        int left = 0;
        for(int right=0;right<nums.length;right++) {
            if(nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 0, 5, 2};
        System.out.println("Before: ");
        for(int n: arr) {
            System.out.println(n);
        }
        MoveZeroesToEnd mzte = new MoveZeroesToEnd();
        mzte.moveZeroes(arr);
        System.out.println("After: ");
        for(int n: arr) {
            System.out.println(n);
        }
    }
}
