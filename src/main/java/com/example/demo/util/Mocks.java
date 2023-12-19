package com.example.demo.util;

import com.example.demo.model.Animal;
import java.util.ArrayList;
import java.util.List;

public class Mocks {
    
    public List<Animal> animales = getAnimales();
    public Animal animal = getAnimal();
    
    public Mocks(){};
    
    public Animal getAnimal(){
        Animal animal = new Animal("Leon",4,35.6F);
        return animal;
    }
    
    public List<Animal> getAnimales(){
        List<Animal> lista = new ArrayList<>();
        Animal animal1 = new Animal("Leon",4,35.6F);
        Animal animal2 = new Animal("Elefante",4,25.3F);
        Animal animal3 = new Animal("Ballena",0,35.6F);
        Animal animal4 = new Animal("Colibri",2,56.6F);
        lista.add(animal1);
        lista.add(animal2);
        lista.add(animal3);
        lista.add(animal4);
        return lista;
    }
    
}
