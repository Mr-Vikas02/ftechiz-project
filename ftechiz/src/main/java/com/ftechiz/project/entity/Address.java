package com.ftechiz.project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "address_line_1", nullable = false)
    private String addressLine1;
    @Column(name = "address_line_2")
    private String addressLine2;
    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String postalCode;
}
