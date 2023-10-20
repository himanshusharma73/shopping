package com.example.onlineshoping.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name="productdetails")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private  String name;// at least 3 char
    private String description; //min 10= max 200 char
    private double mrp; //must be > 0
    private int discountPercentage; //min  = 0, max= 100
    private  long tax;// 0-28
    private LocalDate mfgDate;
    private LocalDate expDate;
    private int quantity;// at least 1

}
