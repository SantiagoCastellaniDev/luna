package com.example.demo.controller;

import com.example.demo.model.Animal;
import com.example.demo.service.AnimalService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
public class AnimalController {
        
    @Autowired
    private AnimalService animalService;
    
     // getAll (Ver Animales)
    @GetMapping ("/animales")
    public List<Animal> getAll() throws Exception{
        return animalService.getAll();
    }
    
    // getAnimal
    @GetMapping ("animal")
    public Animal getAnimal() throws Exception{
        return animalService.getAnimal();
    }
     
     
    
}
