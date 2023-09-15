/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mascotaapp;

import mascotapp.entidades.Mascota;
import mascotapp.entidades.Usuario;
import mascotapp.enumeraciones.RazaGatuna;
import mascotapp.enumeraciones.RazaPerruna;
import mascotapp.enumeraciones.SexoHumano;


/**
 *
 * @author JCarlos
 */
public class MascotaAPP {

    public static void main(String[] args) {
        
      Mascota m1 = new Mascota<RazaPerruna>("Fer", "Chiquito", "Perro");
      m1.setRaza(RazaPerruna.BEAGLE);
      System.out.println(m1.toString());
      
      Mascota m2 = new Mascota<RazaGatuna>("Pepa", "Lola", "Gato");
      m2.setRaza(RazaGatuna.NARANJOSO);
      System.out.println(m2.toString());
    }
}
