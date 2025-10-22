package dsa.advanced.arrays.logical;
/**
 * Union of two sorted arrays
 * Time Complexity - O(m + n)
 * Space Complexity - O(m + n)
 */

import java.util.ArrayList;
import java.util.List;

public class UnionOfTwoSortedArrays {
    public List<Integer> unionArray(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        int n1 = nums1.length, n2 = nums2.length;
        int i = 0, j = 0;
        while(i < n1 && j < n2) {
            if(nums1[i] < nums2[j]) {
                if(result.isEmpty() || result.get(result.size()-1) != nums1[i]) {
                    result.add(nums1[i]);
                }
                i++;
            }else{
                if(result.isEmpty() || result.get(result.size()-1) != nums2[j]) {
                    result.add(nums2[j]);
                }
                j++;
            }
        }
        while(i<n1) {
            if(result.isEmpty() || result.get(result.size()-1) != nums1[i]) {
                result.add(nums1[i]);
            }
            i++;
        }
        while(j<n2) {
            if(result.isEmpty() || result.get(result.size()-1) != nums2[j]) {
                result.add(nums2[j]);
            }
            j++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 7};
        UnionOfTwoSortedArrays union = new UnionOfTwoSortedArrays();
        System.out.println(union.unionArray(arr1, arr2));
    }
}
