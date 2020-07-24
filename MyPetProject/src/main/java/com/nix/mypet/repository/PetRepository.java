package com.nix.mypet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nix.mypet.entity.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet,String>{

}
