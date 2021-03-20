package com.zovlanik.seabattle2.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "fields")
@Data
public class Field {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    Integer id;

}
