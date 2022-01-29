package com.example.jupiter.sorts;

import org.springframework.stereotype.Service;

@Service
public class BubbleSort implements SortArray {
    public int[] swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return nums;
    }
//best -> O(n)
//        worst-> O(n^2)
    @Override
    public int[] sortArray(int[] nums) {
        int siz = nums.length;
        int i = 0;
        while (i < siz) {
            boolean flg=true;
            for (int j = i + 1; j < siz; j++) {
                if (nums[j - 1] > nums[j]) {
                    flg=false;
                    swap(nums, j, j - 1);
                }
            }
            //Break at first sorted array
            if(flg)
                break;
            //size decreases as last elements eveytime gets sorted
            siz--;
        }
        return nums;
    }
}
