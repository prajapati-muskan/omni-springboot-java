package com.example.jupiter.sorts;

import org.springframework.stereotype.Service;

@Service
public class SelectionSort implements SortArray {
    public int[] swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return nums;
    }
    //  best -> O(n^2)
    //  worst-> O(n^2)
    @Override
    public int[] sortArray(int[] nums) {
        int numSize = nums.length;
        int min, minIndex;
        for (int i = 0; i < numSize; i++) {
            min = nums[i];
            minIndex = i;
            for (int j = i + 1; j < numSize; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                nums = swap(nums, minIndex, i);
            }
        }
        return nums;
    }

}
