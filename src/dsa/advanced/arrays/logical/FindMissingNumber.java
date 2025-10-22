package dsa.advanced.arrays.logical;

/**
 * Find Missing Number
 * Time Complexity - O(n)
 * Space Complexity - O(1)
 */
public class FindMissingNumber {

    public int missingNumberSolution1(int[] nums) {
        int n = nums.length;
        int nSum  = (n *(n+1)) / 2;
        int sum = 0;
        for(int num: nums) {
            sum += num;
        }
        return nSum - sum;
    }

    public int missingNumberSolution2(int[] nums) {
        int xor1 = 0, xor2=0;
        for(int i=0;i<nums.length;i++) {
            xor1 ^= (i+1);
            xor2 ^= nums[i];
        }
        return xor1 ^ xor2;
    }

    public static void main(String[] args) {
        int[] arr = {0,2,1,3,4};
        FindMissingNumber fmn = new FindMissingNumber();
        System.out.println(fmn.missingNumberSolution1(arr));
    }
}
