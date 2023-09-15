/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author JCarlos
 */
public class Televisor extends Electrodoméstico {
    
    protected int resolucion; //En pulgadas
    protected boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintonizadorTDT) {
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor(int resolucion, boolean sintonizadorTDT, int precio, String color, char consumoEnergético, int peso) {
        super(precio, color, consumoEnergético, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    //Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
    //padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
    //los atributos del televisor.
    public void crearTelevisor(){
        super.crearElestrodomestico();
        System.out.println("Ingrese la resolución de la TV");
        resolucion = super.leer.nextInt();
        System.out.println("Ingrese si tiene sintonizado TDT: (1 = Sí ; 0 = No)");
        sintonizadorTDT = super.leer.nextBoolean();
    }
    
    //    Método precioFinal(): este método será heredado y se le sumará la siguiente
    //funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
    //incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
    //$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
    //también deben afectar al precio.

    @Override
    public void precioFinal() {
        super.precioFinal();
        if(resolucion>40){super.precio = (float) (super.precio * 1.3);}
        if(sintonizadorTDT == true){super.precio = super.precio + 500;}
        System.out.println("El precio de la TV es: " + super.precio);
        System.out.println("");
    }
    
    
}
