package com.ohgiraffers.ebbackend.repository;

import com.ohgiraffers.ebbackend.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Integer> {
}
