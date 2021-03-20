package com.zovlanik.seabattle2.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "ships")
@Data
public class Ship {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    Integer id;

    @Column(name = "ship_size")
    Integer shipSize;

    @Column(name = "ship_rotation")
    Boolean shipRotation;
}
