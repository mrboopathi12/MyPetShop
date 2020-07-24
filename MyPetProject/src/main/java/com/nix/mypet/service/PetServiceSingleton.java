package com.nix.mypet.service;

 
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nix.mypet.entity.Pet;
import com.nix.mypet.repository.PetRepository;
 
 
@Service 
public class PetServiceSingleton  {

@Autowired
PetRepository petRepository;
 	 
    @Transactional
	public Pet save(Pet pet) {
		 Pet petAdded=petRepository.save(pet);
		 return petAdded;
	}

	public List<Pet> findAll() {
	 List<Pet> petList= petRepository.findAll();
	 return petList;
 	}

	public Optional<Pet> findByName(String perName) {
		Optional<Pet> pet=petRepository.findById(perName);
		return pet;
	}


	 
 
	 
}
