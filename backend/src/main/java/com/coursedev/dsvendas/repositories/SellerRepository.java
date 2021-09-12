package com.coursedev.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursedev.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
