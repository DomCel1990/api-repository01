package com.example.apispringrepository01.entitis;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    @Column(nullable = false)
    private String modelName;
    @Column(nullable = false)
    private int SerialNumber;
    @Column(nullable = false)
    private double currentPrice;

}
