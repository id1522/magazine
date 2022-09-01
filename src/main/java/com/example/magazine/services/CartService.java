package com.example.magazine.services;

import com.example.magazine.models.Cart;
import com.example.magazine.models.Product;
import com.example.magazine.repositories.CartRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
@RequiredArgsConstructor
public class CartService {
    private final CartRepository cartRepository;

    public void  addProductForList(Product product){
        Cart cart = new Cart();
        cart.setId(product.getId());
        cart.setProductTitle(product.getTitle());
        cart.setProductPrice(product.getPrice());
       cartRepository.save(cart);
    }

    public List<Cart> getAll() {
        return cartRepository.findAll();
    }
    public void cleanCart(){
        cartRepository.deleteAll();
    }
    public void deleteProductFromCart(Long id){
        Cart cart= cartRepository.findAllById(id);
        cartRepository.delete(cart);
    }
}

