package com.nix.mypet;


 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nix.mypet.entity.Pet;
import com.nix.mypet.repository.PetRepository;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

@Component
public class MyRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(MyRunner.class);

    @Autowired
    private PetRepository petRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
    logger.info("initializing Pets");
   
    Pet p1=new Pet("Cat",10);
    Pet p2=new Pet("Dog",20);
    List  petlist=new ArrayList<Pet>();
    petlist.add(p1);
    petlist.add(p2);
    petRepository.saveAll(petlist);
    }

    
}