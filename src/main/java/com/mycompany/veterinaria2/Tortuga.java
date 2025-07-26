/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinaria2;

/**
 *
 * @author Usuario
 */
public class Tortuga extends Mascotas  {

    public Tortuga(String nombre, String especie, int edad, boolean vacunado) {
        super(nombre, especie, edad, vacunado);
    }


    
     @Override
    public void descansar() {
     System.out.println("La tortuga esta descansando");
  
    }
    @Override
    public void hacerSonido() {
        System.out.println("ssss sss");
    }
}
