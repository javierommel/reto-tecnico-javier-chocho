package com.javierchocho.ms_cuentas_movimientos.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javierchocho.ms_cuentas_movimientos.entity.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    
    Optional<Cliente> findByNombre(String nombre);
    Optional<Cliente> findByClienteId(Long clienteId);
}
