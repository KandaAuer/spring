package com.example.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

        import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/order")
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping("/add")
    public void addItems(@RequestParam Integer... itemIds) {
        List<Integer> ids = Arrays.stream(itemIds).collect(Collectors.toList());
        cartService.addItems(ids);
    }

    @GetMapping("/get")
    public List<Integer> getItems() {
        return cartService.getItems();
    }
}
