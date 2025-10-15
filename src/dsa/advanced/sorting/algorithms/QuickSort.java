package dsa.advanced.sorting.algorithms;

/**
 * Quick Sort
 * Time Complexity: O(n log n)
 * Space Complexity: O(1)
 */
public class QuickSort {

    public int[] quickSort(int[] nums) {
        quickSort(nums, 0, nums.length-1);
        return nums;
    }

    private void quickSort(int[] nums, int low, int high) {
        if(low < high) {
            int partitionIdx = partition(nums, low, high);
            quickSort(nums, low, partitionIdx-1);
            quickSort(nums, partitionIdx+1, high);
        }
    }

    private int partition(int[] nums, int low, int high) {
        int pivot = nums[low];
        int i=low, j=high;
        while(i<j) {
            while(nums[i] <= pivot && i < high) {
                i++;
            }
            while(nums[j] > pivot && j > low) {
                j--;
            }
            if(i<j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[low];
        nums[low] = nums[j];
        nums[j] = temp;
        return j;
    }

    public static void main(String[] args) {
        int[] arr = {7,4,1,5,3};
        System.out.println("Before sorting");
        for(int n: arr) System.out.println(n);
        QuickSort ms = new QuickSort();
        ms.quickSort(arr);
        System.out.println("After sorting");
        for (int n: arr) System.out.println(n);
    }
}
