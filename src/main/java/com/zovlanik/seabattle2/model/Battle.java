package com.zovlanik.seabattle2.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "battles")
@Data
public class Battle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    Integer id;

    @Column(name = "user1_ID")
    Integer user1ID;

    @Column(name = "user2_ID")
    Integer user2ID;

    @Column(name = "field_ID")
    Integer fieldID;

    @Column(name = "date_of_battle")
    Date dateOfBattle;
}
