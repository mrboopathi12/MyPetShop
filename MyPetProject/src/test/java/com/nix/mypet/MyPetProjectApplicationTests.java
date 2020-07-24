package com.nix.mypet;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nix.mypet.entity.Pet;
import com.nix.mypet.service.PetServicePrototype;
 
@SpringBootTest
class MyPetProjectApplicationTests {

	@Autowired
	PetServicePrototype petServicePrototype;
	
	
	@Test
	void addPets() {
	Pet newPet =new Pet("RosyCat", 1000);
 	Pet pet =petServicePrototype.save(newPet);
    boolean b=pet.getPetName().equals("RosyCat");
    assertThat(b);
	}

}
