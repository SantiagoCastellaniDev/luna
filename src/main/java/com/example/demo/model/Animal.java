
package com.example.demo.model;

public class Animal {
    
    private String nombre;
    private int cantPatas;
    private float velocidad;

    public Animal() {
    }

    public Animal(String nombre, int cantPatas, float velocidad) {
        this.nombre = nombre;
        this.cantPatas = cantPatas;
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantPatas() {
        return cantPatas;
    }

    public void setCantPatas(int cantPatas) {
        this.cantPatas = cantPatas;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }    
    
}
