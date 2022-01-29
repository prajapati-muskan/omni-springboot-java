package com.example.jupiter.sorts;

import org.springframework.stereotype.Service;

@Service
public class QuickSort implements SortArray {
//    I dont want to pass array ref anywhere because I only have to use this function with one object
    public int[] numArr;

    public void quickSort(int low, int high) {
        if (low < high) {
            int pivot = partition(low, high);
            quickSort(low, pivot - 1);
            quickSort(pivot + 1, high);
        }
    }

    public void swap(int x, int y) {
        int temp = numArr[x];
        numArr[x] = numArr[y];
        numArr[y] = temp;
    }

    public int partition(int low, int high) {
        int i = low - 1;
        int pivot = numArr[high];
//        Two pointer where i is for taking care of small elements and j is for higher
//                than pivote element
        for (int j = low; j <= high - 1; j++) {
            if (numArr[j] < pivot) {
                i++;
                swap(i, j);
            }
        }
        swap(++i, high);
        return i;
    }

    @Override
    public int[] sortArray(int[] nums) {
        numArr = nums;
        quickSort(0, nums.length-1);
        return numArr;
    }
}
