package dsa.advanced.arrays.fundamentals;

/**
 * Left Rotate Array By K Places
 * Time Complexity - O(n)
 * Space Complexity - O(k)
 */
public class LeftRotateArrayByKPlaces {
    public void rotateArray(int[] nums, int k) {
        k = k % nums.length;
        int[] temp = new int[k];
        for(int i=0;i<k;i++) {
            temp[i] = nums[i];
        }
        for(int i=0;i<nums.length-k;i++) {
            nums[i] = nums[i+k];
        }
        for(int i=0;i<k;i++) {
            nums[(nums.length-k) + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 5, 3, -5};
        System.out.println("Before rotation:");
        for (int num: arr) {
            System.out.println(num);
        }
        LeftRotateArrayByKPlaces lra = new LeftRotateArrayByKPlaces();
        lra.rotateArray(arr, 8);
        System.out.println("Before rotation:");
        for (int num: arr) {
            System.out.println(num);
        }
    }
}
