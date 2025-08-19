package com.cdac.billingsoftware.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.billingsoftware.entity.UserEntity;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

	Optional<UserEntity> findByEmail(String email);

	Optional<UserEntity> findByUserId(String userId);
}
