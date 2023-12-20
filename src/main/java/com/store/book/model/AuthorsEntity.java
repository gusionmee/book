package com.store.book.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@jakarta.persistence.Table(name = "Authors", schema = "bookstore", catalog = "")
public class AuthorsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "AuthorID")
    private int authorId;

  

    @Basic
    @Column(name = "AuthorName")
    private String authorName;

   

    @Basic
    @Column(name = "AuthorBiography")
    private String authorBiography;

   

}
