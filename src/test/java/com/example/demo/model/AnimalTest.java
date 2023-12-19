package com.example.demo.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AnimalTest {
    
    // Seteamos unos valores predeterminados.
    
    private static final String NOMBRE = "Jirafa";
    private static final int CANTPATAS = 4;
    private static final float VELOCIDAD = 12.3F;    
    
    // Anotación que indica el código a testear.
    @Test 
    void test(){
        Animal animal = mockAnimal(); // Utilizamos el objeto mock creado
        
        // Comprobamos que el valor recibido en los getters es igual al seteado en los setters
        
        assertEquals(NOMBRE,animal.getNombre());
        assertEquals(CANTPATAS,animal.getCantPatas());
        assertEquals(VELOCIDAD,animal.getVelocidad());       
    }
    
    public static Animal mockAnimal(){
        // Construimos un objeto mock que representa a un objeto de la clase
        Animal animal = new Animal();
        animal.setNombre(NOMBRE);
        animal.setCantPatas(CANTPATAS);
        animal.setVelocidad(VELOCIDAD);
        return animal;
    }
    
}