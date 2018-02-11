package com.pospa.sortservice.service;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class BubbleSortService implements SortService {

    public List<Integer> sort(List<Integer> array, boolean descending) {
        List<Integer> integers = bubbleSort(array);
        if (descending)
            Collections.reverse(integers);
        return integers;
    }

    private List<Integer> bubbleSort(List<Integer> integers) {
        int n = integers.size();
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (integers.get(j - 1) > integers.get(j)) {
                    //swap
                    temp = integers.get(j - 1);
                    integers.set(j - 1, integers.get(j));
                    integers.set(j, temp);
                }
            }
        }
        return integers;
    }
}
