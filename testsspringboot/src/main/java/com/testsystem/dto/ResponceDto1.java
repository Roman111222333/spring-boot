package com.testsystem.dto;

import java.util.List;

/**
 * Created by roman.ali on 9/2/2022.
 */
public class ResponceDto1 {
    private int count;
    private List<Entries> entries;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Entries> getEntries() {
        return entries;
    }

    public void setEntries(List<Entries> entries) {
        this.entries = entries;
    }
}