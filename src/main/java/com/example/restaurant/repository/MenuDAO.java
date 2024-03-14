package com.example.restaurant.repository;

import com.example.restaurant.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuDAO extends JpaRepository<Menu, Integer> {
}
