package com.example.booknation.models;

import javax.persistence.*;
import java.io.Serializable;

public class CartItemKey implements Serializable {
    @Column(name = "book_id")
    Long bookId;

    @Column(name = "cart_id")
    Long cartId;

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Long getCartId() {
        return cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }
// standard constructors, getters, and setters
    // hashcode and equals implementation{
}