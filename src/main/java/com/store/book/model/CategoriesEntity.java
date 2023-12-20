package com.store.book.model;

import jakarta.persistence.*;
import lombok.*;


import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@jakarta.persistence.Table(name = "Categories", schema = "bookstore", catalog = "")
public class CategoriesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "CategoryID")
    private int categoryId;

   

    @Basic
    @Column(name = "CategoryName")
    private String categoryName;

    
}
