/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.veterinaria2;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public abstract class ConsultaVeterinaria {

    public static  void main(String[] args) {
        
        ArrayList<Mascotas> mascotas =new ArrayList<>();
        mascotas.add(new Perro("Fido"," Manifero Carnivoro",5,true));
        mascotas.add(new Gato("Michi","Manifero Carnivoro",3,true));
        mascotas.add(new Conejo("Tambor","Manifero",8,true));
        mascotas.add(new Tortuga("Shelly","Reptil",10,true)); 

        for (Mascotas m : mascotas) {
            m.hacerSonido();
            m.descansar();

          
            if (m instanceof AtencionEspecial) {
                ((AtencionEspecial) m).recibirAtencionEspecial();
            }

            
            if (m instanceof Vacunable) {
                ((Vacunable) m).vacunar();
            }

            System.out.println("------");
        }
    }
}
        
        
    

