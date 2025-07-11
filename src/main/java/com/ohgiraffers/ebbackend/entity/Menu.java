package com.ohgiraffers.ebbackend.entity;

import jakarta.persistence.*;

@Entity
@Table(name="tbl_menu")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int menuCode;
    private String menuName;
    private String menuPrice;
    private String categoryCode;
    private String orderableStatus;
}
