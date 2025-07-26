/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinaria2;

/**
 *
 * @author Usuario
 */
public abstract class Mascotas implements AtencionEspecial{
     
 private String nombre;
    private String especie;
    private int edad;
    private boolean vacunado;

    public Mascotas(String nombre, String especie, int edad, boolean vacunado) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.vacunado = vacunado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Especie: " + especie + ", Edad: " + edad);
        System.out.println("Vacunado: " + vacunado);
    }

    public abstract void hacerSonido();

    public void descansar() {
        System.out.println("La mascota está descansando");
    }

    @Override
    public void recibirAtencionEspecial() {
        System.out.println("esta recibiendo atencion especial");
    }
    
   
    public void vacunar(){
    
    }
}
    
    
    
    
    
    

