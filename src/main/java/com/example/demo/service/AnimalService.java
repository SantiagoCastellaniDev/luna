
package com.example.demo.service;

import com.example.demo.model.Animal;
import java.util.List;

public interface AnimalService {
    
     public List<Animal> getAll() throws Exception;
     
     public Animal getAnimal() throws Exception;
    
}
