package com.nix.mypet.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nix.mypet.entity.Pet;
import com.nix.mypet.service.PetServicePrototype;
import com.nix.mypet.service.PetServiceSingleton;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;

@Controller
@RequestMapping({ "/pet" })
public class PetController {

    
    @Autowired
    private PetServiceSingleton petServiceSingleton;

    
    @GetMapping({ "/get" })
    public String getAllPets1(Model model) {
    	 model.addAttribute("pets", petServiceSingleton.findAll());
    	 return "index";
    }
  
    @GetMapping("/addNew")
    public String create1(@Validated Pet pet, BindingResult result, Model model) {
	 		return "add-pet";
    }
    
    @PostMapping("/addSubmit")
    public String create2(@Validated Pet pet, BindingResult result, Model model) {
   	   if (pet==null) {
			return "add-pet";
		}
	lookUpPerServicePrototype().save(pet);
	model.addAttribute("pets", lookUpPerServicePrototype().findAll());
	return "index";
	 		 
    }
    
    @Lookup
    public PetServicePrototype lookUpPerServicePrototype() {
     	return null;
    }
     
     
}