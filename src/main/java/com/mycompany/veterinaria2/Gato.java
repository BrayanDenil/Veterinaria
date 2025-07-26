/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinaria2;

/**
 *
 * @author Usuario
 */
public class Gato extends Mascotas implements AtencionEspecial{
    
    public Gato(String nombre, String especie, int edad, boolean vacunado) {
        super(nombre, especie, edad, vacunado);
    }
    @Override
    public void descansar(){
      System.out.println("El Gato esta descansando");
    }

    @Override
    public void recibirAtencionEspecial() {
        
    }  

    @Override
    public void hacerSonido() {
       System.out.println("miau miau");  
    }
}
