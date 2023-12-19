
package com.example.demo.serviceImpl;

import com.example.demo.model.Animal;
import com.example.demo.service.AnimalService;
import com.example.demo.util.Mocks;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AnimalServiceImpl implements AnimalService{

    @Override
    public List<Animal> getAll() throws Exception {
        Mocks mocks = new Mocks();
        List<Animal> lista = mocks.getAnimales();
        return lista;
    }
    
    @Override
    public Animal getAnimal() throws Exception {
        Mocks mocks = new Mocks();
        Animal animal = mocks.getAnimal();
        return animal;
    }
    
}
