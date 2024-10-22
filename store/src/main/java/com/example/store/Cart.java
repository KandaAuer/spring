package com.example.store;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Integer> items = new ArrayList<>();

    public void addItems(List<Integer> newItems) {
        items.addAll(newItems);
    }

    public List<Integer> getItems() {
        return items;
    }
}
