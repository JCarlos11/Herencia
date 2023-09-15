/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2_herencia;

import Entidades.Electrodoméstico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;

/**
    Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
    el precio final de los dos electrodomésticos.
 */

/**
 * Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
 * @Ejercicio3
 */
public class Ejercicio2_Herencia {

    public static void main(String[] args) {
        
        ArrayList<Electrodoméstico> e1 = new ArrayList();
        
        Lavadora l1 = new Lavadora(10, 2000, "rojo", 'D', 42);
        Lavadora l2 = new Lavadora(25, 540, "azul", 'B', 58);
        Televisor t1 = new Televisor(90, true, 1000, "blanco", 'G', 100);
        Televisor t2 = new Televisor(5, false, 500, "verde", 'O', 850);
        
        e1.add(l1);
        e1.add(l2);
        e1.add(t1);
        e1.add(t2);
        
        Electrodoméstico prueba = new Electrodoméstico();
        int carga = 1;
        float precioTOTAL = 0 ;
        float precioTV = 0;
        float precioLAV = 0;
        
        for (int i = 0; i < e1.size(); i++) {
            e1.get(i).precioFinal();
        }
        
        precioLAV = e1.get(0).getPrecio() + e1.get(1).getPrecio(); 
        precioTV = e1.get(2).getPrecio() + e1.get(3).getPrecio(); 
        
        System.out.println("El precio de las lavadoras es: " + precioLAV);
        System.out.println("El precio de las TV es: " + precioTV);
        System.out.println("El precio total es de : " + (precioTV + precioLAV));

        /*Lavadora whirpul = new Lavadora();
        Televisor sonyc = new Televisor();
        
        whirpul.crearLavadora();
        sonyc.crearTelevisor();
        whirpul.precioFinal();
        sonyc.precioFinal();
        
        System.out.println("El precio de la lavadora es: " + whirpul.getPrecio());
        System.out.println(whirpul.toString());
        System.out.println("----------------------------------------------------");
        System.out.println("El precio de la TV es: " + sonyc.getPrecio());
        System.out.println(sonyc.toString());
        */
        
        
                
    }
}
