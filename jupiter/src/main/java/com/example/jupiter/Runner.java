package com.example.jupiter;

import com.example.jupiter.services.CommonServiceImpl;
import com.example.jupiter.sorts.BubbleSort;
import com.example.jupiter.sorts.InsertionSort;
import com.example.jupiter.sorts.SelectionSort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.sound.midi.SysexMessage;
import java.util.Arrays;
import java.util.List;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    private CommonServiceImpl commonService;
    @Autowired
    private SelectionSort selectionSort;
    @Autowired
    private InsertionSort insertionSort;
    @Autowired
    private BubbleSort bubbleSort;

    public void runnerMeth() {
        commonService.overrideTestMeth();
    }

    @Override
    public void run(String... args) throws Exception {
        int[] nums = new int[]{2, 5, 89, 3, 8, 1};
        System.out.println("Selection sort " + Arrays.toString(selectionSort.sortArray(nums)));
        nums = new int[]{2, 5, 89, 3, 8, 1};
        System.out.println("Bubble sort " + Arrays.toString(bubbleSort.sortArray(nums)));
        nums = new int[]{2, 5, 89, 3, 8, 1};
        System.out.println("Insertion sort " + Arrays.toString(insertionSort.sortArray(nums)));
    }
}
