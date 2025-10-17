package dsa.advanced.arrays.fundamentals;

/**
 * Linear Search
 * Time Complexity - O(n)
 * Space Complexity - O(1)
 */
public class LinearSearch {
    public int linearSearch(int nums[], int target) {
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5,6,3,2,1};
        LinearSearch ls = new LinearSearch();
        System.out.println(ls.linearSearch(arr, 3));
        System.out.println(ls.linearSearch(arr, 8));
    }
}
