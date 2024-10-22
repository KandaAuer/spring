package com.example.store;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Service
@SessionScope
public class CartService {
    private final Cart cart = new Cart();

    public void addItems(List<Integer> itemIds) {
        cart.addItems(itemIds);
    }

    public List<Integer> getItems() {
        return cart.getItems();
    }
}
