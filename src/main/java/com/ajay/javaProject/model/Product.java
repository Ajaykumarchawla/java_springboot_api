package com.ajay.javaProject.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String Brand;

    private String description;
    private double price;
    private String category;
    private int stockQuantity;

    private Date releaseDate;
    private boolean productAvailable;

    private String imageName;
    private String imageType;

    @Lob
    private byte[] imageData;
}
