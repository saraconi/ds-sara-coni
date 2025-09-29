ClienteRepository.java (em src/main/java/com/minhaloja/clientesapi/repository/)
        package com.minhaloja.clientesapi.repository;

import com.minhaloja.clientesapi.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
