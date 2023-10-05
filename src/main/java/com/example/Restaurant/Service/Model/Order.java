package com.example.Restaurant.Service.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Long orderId;

    @ManyToOne
    @JoinColumn(name = "fk_foodId")
    Food food;

    private int quantity;

    @ManyToOne
    @JoinColumn(name = "fk_userId")
     User user;

    @Enumerated(EnumType.STRING)
    private Status status;


}
