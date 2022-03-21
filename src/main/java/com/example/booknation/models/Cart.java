package com.example.booknation.models;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;


@Entity
@Table(	name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "users_id", referencedColumnName = "id")
    private User user;


    @OneToMany(mappedBy = "cart")
    private Set<CartItem> items;

    public Cart() {
    }

    public Set<CartItem> getItems() {
        return items;
    }

    public void setItems(Set<CartItem> items) {
        this.items = items;
    }
}