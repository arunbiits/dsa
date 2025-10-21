package dsa.advanced.arrays.fundamentals;

/**
 * Second-Largest Element
 * Time Complexity - O(n)
 * Space Complexity - O(1)
 */
public class SecondLargestElement {
    public int secondLargestElement(int[] nums) {
        int max1 = nums[0], max2 = Integer.MIN_VALUE;
        for(int num: nums) {
            if(num > max1) {
                max2 = max1;
                max1 = num;
            }else if(num > max2 && num < max1) {
                max2 = num;
            }
        }
        return max2 == Integer.MIN_VALUE ? -1 : max2;
    }

    public static void main(String[] args) {
        int[] arr = {5,8,1,3,2};
        SecondLargestElement sle = new SecondLargestElement();
        System.out.println(sle.secondLargestElement(arr));
    }
}
