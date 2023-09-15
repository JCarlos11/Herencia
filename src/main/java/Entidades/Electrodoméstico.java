package Entidades;

import Enumeraciones.Colores;
import java.util.Scanner;

public class Electrodoméstico {
    
    protected float precio;
    protected String color;
    protected char consumoEnergético;
    protected float peso;
    
    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Electrodoméstico() {
    }

    public Electrodoméstico(float precio, String color, char consumoEnergético, float peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergético = comprobarConsumoEnergetico(consumoEnergético);
        this.peso = peso;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergético() {
        return consumoEnergético;
    }

    public void setConsumoEnergético(char consumoEnergético) {
        this.consumoEnergético = consumoEnergético;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
//  Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
//  sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
//  objeto y no será visible.
    private static char comprobarConsumoEnergetico(char letra){
        String letraS = letra + "" ;
  
        if (letraS.codePointAt(0) > 70 && letraS.codePointAt(0) < 65) {
           letra = 'F';
        }
        
        return letra;
    }
    
    //Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
    //usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
    //blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
    //minúsculas. Este método se invocará al crear el objeto y no será visible.
    private static String comprobarColor(String color){
        
        boolean esDiferente = true;
        for(Colores c : Colores.values()){
            if(color.toUpperCase() == c.toString()){
                esDiferente = false;
            }
        }
        
        if(esDiferente == true){
            color = Colores.BLANCO.toString();
        }
        return color;

    }
    
    //Metodo crearElectrodomestico(): le pide la información al usuario y llena el
    //electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
    //precio se le da un valor base de $1000.
    
    public void crearElestrodomestico(){
        System.out.println("Se creará un nuevo electrodomestico...");
        System.out.println("Ingrese color: ");
        color = comprobarColor(leer.nextLine());
        System.out.println("Ingrese peso: ");
        peso = leer.nextFloat();
        System.out.println("Ingrese consumo energético: ");
        leer.nextLine();
        String cE = leer.nextLine();
        consumoEnergético = comprobarConsumoEnergetico(cE.charAt(0));
        precio = 1000;
    }
    
    //Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
    //precio. Esta es la lista de precios:
   
    public void precioFinal(){
        
        switch(this.consumoEnergético){
            case 'A':
                this.precio = this.precio + 1000;
                break;
            case 'B':
                setPrecio((int) (precio+800));
                break;
            case 'C':
                precio = precio + 600;
                break;
            case 'D':
                precio = precio + 500;
                break;
            case 'E':
                precio = precio + 300;
                break;
            case 'F':
                precio = precio + 100;
                break;
        }
        
        if(peso >= 1 && peso <=19){ precio = precio + 100; } 
        if(peso >= 20 && peso <=49){ precio = precio + 500; } 
        if(peso >= 50 && peso <=79){ precio = precio + 800; } 
        if(peso >= 80){ precio = precio + 1000; } 
    }

    @Override
    public String toString() {
        return "Electrodom\u00e9stico{" + "precio=" + precio + ", color=" + color + ", consumoEnerg\u00e9tico=" + consumoEnergético + ", peso=" + peso + ", leer=" + leer + '}';
    }

    
}
