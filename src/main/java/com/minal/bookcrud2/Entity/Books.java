package com.minal.bookcrud2.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Books")
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    private String bookName;
    private String author;
    private double price;
}
