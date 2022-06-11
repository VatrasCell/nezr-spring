package com.vatrascell.nezrspring.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "hello")
@Data
@NoArgsConstructor
public class Hello {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private int number;
}
