package dsa.advanced.sorting.algorithms;

/**
 * Insertion Sort
 * Time Complexity - O(n^2)
 * Space Complexity - O(1)
 */
public class InsertionSort {

    public int[] insertionSort(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++) {
            int j = i;
            while(j > 0 && nums[j-1] > nums[j]) {
                int temp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = temp;
                j--;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {7,4,1,5,3};
        System.out.println("Before sorting");
        for(int n: arr) System.out.println(n);
        InsertionSort is = new InsertionSort();
        is.insertionSort(arr);
        System.out.println("After sorting");
        for (int n: arr) System.out.println(n);
    }
}
