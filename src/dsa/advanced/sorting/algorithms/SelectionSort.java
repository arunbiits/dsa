package dsa.advanced.sorting.algorithms;

/**
 * Selection Sort
 * Time Complexity - O(n^2)
 * Space Complexity - O(1)
 */
public class SelectionSort {
    public int[] selectionSort(int[] nums) {
        int n = nums.length;

        for(int i=0;i<n;i++) {
            //Keep the i as the minIdx
            int minIdx = i;

            //Start from i+1 and check if any element exists i.e, < nums[minIdx]
            for(int j=i+1;j<n;j++) {
                if(nums[j] < nums[minIdx]) {
                    minIdx = j;
                }
            }

            //swap the minIdx with i
            int temp = nums[i];
            nums[i] = nums[minIdx];
            nums[minIdx] = temp;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {7,4,1,5,3};
        System.out.println("Before sorting: ");
        for(int n: nums) System.out.println(n);
        SelectionSort ss = new SelectionSort();
        ss.selectionSort(nums);
        System.out.println("After sorting: ");
        for(int n: nums) System.out.println(n);
    }
}
