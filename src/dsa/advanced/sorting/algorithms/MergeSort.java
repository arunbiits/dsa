package dsa.advanced.sorting.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Merge Sort
 * Time Complexity - O(n log n)
 * Space Complexity - O(n)
 */
public class MergeSort {

    public int[] mergeSort(int[] nums) {
        int n = nums.length;
        mergeSort(nums, 0, n-1);
        return nums;
    }

    private void mergeSort(int[] nums, int low, int high) {
        if(low >= high) return;
        int mid = (low + high) / 2;
        mergeSort(nums, low, mid);
        mergeSort(nums, mid+1, high);
        merge(nums, low, mid, high);
    }

    private void merge(int[] nums, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();
        int left = low, right = mid + 1;
        while(left <= mid && right <= high) {
            if(nums[left] < nums[right]) {
                temp.add(nums[left]);
                left++;
            }else{
                temp.add(nums[right]);
                right++;
            }
        }
        while(left <= mid) {
            temp.add(nums[left]);
            left++;
        }
        while(right <= high) {
            temp.add(nums[right]);
            right++;
        }
        for(int i=0;i<temp.size();i++) {
            nums[i+low] = temp.get(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {7,4,1,5,3};
        System.out.println("Before sorting");
        for(int n: arr) System.out.println(n);
        MergeSort ms = new MergeSort();
        ms.mergeSort(arr);
        System.out.println("After sorting");
        for (int n: arr) System.out.println(n);
    }
}
