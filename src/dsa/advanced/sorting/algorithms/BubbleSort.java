package dsa.advanced.sorting.algorithms;

/**
 * Bubble Sort
 * Time Complexity - O(n^2)
 * Space Complexity - O(1)
 */
public class BubbleSort {
    public int[] bubbleSort(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n-1;i++) {
            boolean isSwapped = false;
            for(int j=0;j<n-i-1;j++) {
               if(nums[j] >  nums[j+1]) {
                   int temp = nums[j];
                   nums[j] = nums[j+1];
                   nums[j+1] = temp;
                   isSwapped = true;
               }
            }
            if(!isSwapped) {
                break;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {5,4,1,7,3};
        System.out.println("Before Sorting:");
        for (int n: nums) System.out.println(n);
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(nums);
        System.out.println("After Sorting:");
        for (int n: nums) System.out.println(n);
    }
}
