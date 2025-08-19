package com.cdac.billingsoftware.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.billingsoftware.entity.OrderItemEntity;

public interface OrderItemEntityRepository extends JpaRepository<OrderItemEntity, Long> {
}
