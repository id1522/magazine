package com.example.magazine.controller;

import com.example.magazine.models.Product;
import com.example.magazine.services.CartService;
import com.example.magazine.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class CartController {
    private final CartService cartService;
    private final ProductService productService;

    @GetMapping("/cart")
    public String showCart(Model model) {
        model.addAttribute("carts", cartService.getAll());
        return "carts";
    }

    @GetMapping("/cart/null")
    public String redirect() {
        return "redirect:/";
    }

    @PostMapping("/cart/add")
    public String productAdd(Long id) {
        Product product = productService.getProductById(id);
        cartService.addProductForList(product);
        return "redirect:/";
    }

    @PostMapping("/cart/delete/{id}")
    public String deleteProduct(Long id) {
        cartService.deleteProductFromCart(id);
        return "redirect:/cart";
    }
}
