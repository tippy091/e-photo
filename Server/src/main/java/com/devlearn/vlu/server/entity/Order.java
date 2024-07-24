package com.devlearn.vlu.server.entity;

import com.devlearn.vlu.server.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author tippy091
 * @created 24/07/2024
 * @project Server
 **/

@Entity
@Data
@Table(name="orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String orderDescription;

    private Date date;
    private Long amount;
    private String address;
    private String payment;
    private OrderStatus orderStatus;
    private Long totalAmount;

    private Long discount;
    // Automatic Tracking ID
    private UUID trackingId;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "order")
    private List<CartItems> cartItems;





}
