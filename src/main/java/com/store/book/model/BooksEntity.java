package com.store.book.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@jakarta.persistence.Table(name = "Books", schema = "bookstore", catalog = "")
public class BooksEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "BookID")
    private int bookId;


    @Basic
    @Column(name = "Title")
    private String title;


    @Basic
    @Column(name = "Author")
    private String author;


    @Basic
    @Column(name = "Genre")
    private String genre;


    @Basic
    @Column(name = "Publisher")
    private String publisher;


    @Basic
    @Column(name = "PublicationYear")
    private Integer publicationYear;


    @Basic
    @Column(name = "Price")
    private BigDecimal price;


    @Basic
    @Column(name = "QuantityInStock")
    private Integer quantityInStock;


}
