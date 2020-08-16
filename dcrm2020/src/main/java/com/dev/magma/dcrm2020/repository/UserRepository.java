package com.dev.magma.dcrm2020.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.magma.dcrm2020.model.AuthenticationRequest;

public interface UserRepository extends JpaRepository<AuthenticationRequest, Long> {
	AuthenticationRequest findByUserName(String userName);
}
