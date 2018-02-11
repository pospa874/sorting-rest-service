package com.pospa.sortservice.dto;

import java.util.List;

public class SortResponse {

    private final List<Integer> integers;

    public SortResponse(List<Integer> integers) {
        this.integers = integers;
    }

    public List<Integer> getIntegers() {
        return integers;
    }
}
