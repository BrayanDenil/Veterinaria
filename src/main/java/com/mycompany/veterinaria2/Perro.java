/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinaria2;

/**
 *
 * @author Usuario
 */

  public class Perro extends Mascotas implements AtencionEspecial {
    public Perro(String nombre, String especie, int edad, boolean vacunado) {
        super(nombre, especie, edad, vacunado);
    }

    
    
    @Override
    public void descansar(){
      System.out.println("El Perro esta descansando");
    }

    @Override
    public void recibirAtencionEspecial() {
        System.out.println("El Perro esta recibiendo atencion Especial");
    }

    @Override
    public void hacerSonido() {
        System.out.println("guau guau");
    }


}
