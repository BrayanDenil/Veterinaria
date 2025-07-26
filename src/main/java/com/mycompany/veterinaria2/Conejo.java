/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinaria2;

/**
 *
 * @author Usuario
 */
public class Conejo extends Mascotas implements AtencionEspecial, Vacunable {
    
    public Conejo(String nombre, String especie, int edad, boolean vacunado) {
        super(nombre, especie, edad, vacunado);
    }

    
        
             @Override 
    public void descansar(){
    System.out.println("El conejo esta descansando");
    
    
    }

    @Override
    public void recibirAtencionEspecial() {
        System.out.println("Recibiendo atencin medica");
    }

    @Override
    public void hacerSonido() {
         System.out.println("ruu ruu");
    }

    @Override
    public void vacunar() {
        System.out.println("El conejo ha sido vacuando");
    }
    
}
