package dsa.advanced.arrays.logical;

/**
 * Intersection of two sorted arrays
 * Time Complexity - O(m + n)
 * Space Complexity - O(min(m, n))
 */

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoSortedArrays {
    public List<Integer> intersectionArray(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        int i = 0, j = 0;
        List<Integer> intersection = new ArrayList<>();
        while(i < n1 && j < n2) {
            if(nums1[i] < nums2[j]) {
                i++;
            }else if(nums1[i] > nums2[j]) {
                j++;
            }else{
                intersection.add(nums1[i]);
                i++;
                j++;
            }
        }
        return intersection;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 5}, arr2 = {1, 2, 7};
        IntersectionOfTwoSortedArrays intersection = new IntersectionOfTwoSortedArrays();
        System.out.println(intersection.intersectionArray(arr1, arr2));
    }
}
