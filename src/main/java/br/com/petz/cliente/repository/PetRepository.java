package br.com.petz.cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.petz.cliente.model.entity.Pet;

public interface PetRepository extends JpaRepository<Pet, Integer>{

}
