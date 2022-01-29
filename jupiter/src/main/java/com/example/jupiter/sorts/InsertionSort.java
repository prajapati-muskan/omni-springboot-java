package com.example.jupiter.sorts;

import org.springframework.stereotype.Service;

@Service
public class InsertionSort implements SortArray {

    @Override
    public int[] sortArray(int[] nums) {
        int siz = nums.length;
        if (siz <= 1)
            return nums;
        else {
            //O(n) for already sorted and O(n^2) for worse case
            for (int i = 1; i < siz; i++) {
                int j = i;
                while (j > 0) {
                    if (nums[j] >= nums[j-1])
                        break;
                    else {
                        int temp = nums[j];
                        nums[j]=nums[j-1];
                        nums[j-1] = temp;
                    }j--;
                }
// O(n^2) for all cases
//                for (int j = 0; j <= i; j++) {
//                    if (j == i) {
//                        nums[j] = pick;
//                    } else if (pick < nums[j]) {
//                        int temp = pick;
//                        pick = nums[j];
//                        nums[j] = temp;
//                    }
//                }
            }
        }
        return nums;
    }
}
