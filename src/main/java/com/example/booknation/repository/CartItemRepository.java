package com.example.booknation.repository;

import com.example.booknation.models.CartItem;
import com.example.booknation.models.CartItemKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, CartItemKey> {

}