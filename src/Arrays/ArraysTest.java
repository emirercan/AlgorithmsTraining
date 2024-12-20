package Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] nums1 = {-1,-100,3,99};
        rotate(nums1,2);
        System.out.println(java.util.Arrays.toString(nums1));

    }

    /*
    Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique
    element appears only once.
    The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
     */
    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int result = 1;
        int currentNumber = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != currentNumber) {
                result += 1;
                currentNumber = nums[i];
            }
        }

        return result;
    }

    /*
    You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

    On each day, you may decide to buy and/or sell the stock.
    You can only hold at most one share of the stock at any time.
    However, you can buy it then immediately sell it on the same day.

    Find and return the maximum profit you can achieve.
     */

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }

        return maxProfit;
    }

    /*
    Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
     */

    public static void rotate(int[] nums, int k) {
        k %= nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
