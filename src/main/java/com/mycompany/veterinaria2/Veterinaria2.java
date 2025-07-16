/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.veterinaria2;

/**
 *
 * @author Usuario
 */
public class Veterinaria2 {

    public static void main(String[] args) {
    Mascotas m1 = new Mascotas("Perro","mamifero carnivoro",2,true);
    Mascotas m2 = new Mascotas("Gato","mamifero carnivoro",4,false);
    Mascotas m3= new Mascotas("Tortuga","maritimos",10,true);
    
        m1.mostrarInformacion();
        m2.mostrarInformacion();
        m3.mostrarInformacion();
    }
}
