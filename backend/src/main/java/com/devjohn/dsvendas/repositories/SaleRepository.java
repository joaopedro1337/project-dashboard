package com.devjohn.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devjohn.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
