package com.pospa.sortservice.dto;

import java.util.List;

public class SortRequest {

    private List<Integer> array;
    private boolean descending;


    public SortRequest() {
    }

    public SortRequest(List<Integer> array, boolean descending) {
        this.array = array;
        this.descending = descending;
    }

    public List<Integer> getArray() {
        return array;
    }

    public void setArray(List<Integer> array) {
        this.array = array;
    }

    public boolean isDescending() {
        return descending;
    }

    public void setDescending(boolean descending) {
        this.descending = descending;
    }
}
