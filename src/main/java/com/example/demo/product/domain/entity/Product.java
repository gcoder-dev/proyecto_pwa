package com.example.demo.product.domain.entity;

import com.example.demo.category.domain.entity.Category;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
    private Long id;
    private String name;
    private String price;
    private String image;
    private Integer total;

    private Category category;
}
