package com.example.demo.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Gift;

public interface GiftRepo extends JpaRepository<Gift,Integer>{
    
}