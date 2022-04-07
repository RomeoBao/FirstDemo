package com.google.leetcode;

public class PracticeTest {

    public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public int searchInsert(int[] nums, int target) {
        int r = nums.length - 1;
        int l = 0;

        if (r < 0) {
            return 0;
        }

        while (l <= r) {
            int mid = (l + (r - l)) - 1 / 2;
            if (nums[mid] > target) {
                r = mid - 1;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                return mid;
            }
        }

        return r + 1;
    }
}
