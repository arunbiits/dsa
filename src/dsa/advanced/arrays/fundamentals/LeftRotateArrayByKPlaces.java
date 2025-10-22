package dsa.advanced.arrays.fundamentals;

/**
 * Left Rotate Array By K Places
 * Time Complexity - O(n)
 * Space Complexity - O(1)
 */
public class LeftRotateArrayByKPlaces {
    public void rotateArray(int[] nums, int k) {
        k = k % nums.length;
        reverse(0, k-1, nums);
        reverse(k, nums.length-1, nums);
        reverse(0, nums.length-1, nums);
    }

    private void reverse(int start, int end, int[] arr) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
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
