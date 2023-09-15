/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author JCarlos
 */
public class Lavadora extends Electrodoméstico {
    protected int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, int precio, String color, char consumoEnergético, int peso) {
        super(precio, color, consumoEnergético, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    //Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
    //padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
    //el atributo propio de la lavadora.
    
    public void crearLavadora(){
        super.crearElestrodomestico();
        System.out.println("");
        System.out.println("Ingrese carga: ");
        carga = super.leer.nextInt();
    }
    
    //Método precioFinal(): este método será heredado y se le sumará la siguiente
    //funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
    //carga es menor o igual, no se incrementará el precio. Este método debe llamar al
    //método padre y añadir el código necesario. Recuerda que las condiciones que hemos
    //visto en la clase Electrodoméstico también deben afectar al precio.

    @Override
    public void precioFinal() {
        super.precioFinal(); 
        if(carga>30){
            super.precio = super.precio + 500;
        }
        System.out.println("El precio de la lavadora es: " + super.precio);
        System.out.println("");
    }

    

   
    
    
    
}
