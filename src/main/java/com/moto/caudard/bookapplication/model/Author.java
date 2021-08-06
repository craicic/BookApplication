package com.moto.caudard.bookapplication.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_seq")
    @Setter(AccessLevel.NONE)
    private Long id;

    private String firstname;

    private String lastname;

    @ManyToMany(mappedBy = "authors")
    private Set<Book> books;
}
