package com.minhaloja.clientesapi.repository;



import com.minhaloja.clientesapi.model.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;



public interface ClienteRepository extends JpaRepository<Cliente, Long> {

} 