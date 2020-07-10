package br.com.petz.cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.petz.cliente.model.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
