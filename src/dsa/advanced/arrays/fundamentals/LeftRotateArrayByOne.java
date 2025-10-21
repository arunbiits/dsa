package dsa.advanced.arrays.fundamentals;
/**
 * Left Rotate Array By One
 * Time Complexity - O(n)
 * Space Complexity - O(1)
 */
public class LeftRotateArrayByOne {
    public void rotateArrayByOne(int[] nums) {
        int temp = nums[0];
        for(int i=1;i<nums.length;i++) {
            nums[i-1] = nums[i];
        }
        nums[nums.length-1] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,1,2,3};
        System.out.println("Before Rotation");
        for (int num: arr) {
            System.out.println(num);
        }
        LeftRotateArrayByOne lra = new LeftRotateArrayByOne();
        lra.rotateArrayByOne(arr);
        System.out.println("After Rotation");
        for (int num: arr) {
            System.out.println(num);
        }
    }
}
