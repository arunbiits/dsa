package dsa.advanced.arrays.logical;

/**
 * Remove Duplicates From Sorted Array
 * Time Complexity - O(n)
 * Space Complexity - O(1)
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        for(int right=0;right<nums.length;right++) {
            if(nums[right] != nums[left]) {
                left++;
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
            }
        }
        return left + 1;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 3, 3, 5, 6};
        RemoveDuplicatesFromSortedArray rdfsa = new RemoveDuplicatesFromSortedArray();
        int end = rdfsa.removeDuplicates(arr);
        for(int i=0;i<end;i++) {
            System.out.println(arr[i]);
        }
    }
}
