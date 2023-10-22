package com.Geekster.User.Expense.Tracker.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;

    private LocalDate orderDate;

    @ManyToOne()
    @JoinColumn(name = "fk_Product_id")
    private Product product;

    @ManyToOne()
    @JoinColumn(name = "fk_user_id")
    private User user;

    // Coded by: Amit Ashok Swain
    // GitHub - amitashokswain
    // E-mail - business.amitswain@gmail.com
    // Instagram - _sanatani_hindutwa_

    public Order(LocalDate orderDate,Product product,User user)
    {
        this.orderDate = orderDate;
        this.product = product;
        this.user = user;
    }

}

