/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mascotapp.servicios;

import java.util.ArrayList;
import java.util.Scanner;
import mascotapp.entidades.Mascota;

/**
 *
 * @author JCarlos
 */
public class ServicioMascota {
    
    private Scanner leer;
    
    private ArrayList<Mascota> mascotas;
    
    public ServicioMascota(){
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
    }
    
    public Mascota crearMascota(){
       
        System.out.println("Introducir nombre");
        String nombre = leer.next();
        
        System.out.println("Intoducir apodo");
        String apodo = leer.next();
        
        System.out.println("Introducir tipo");
        String tipo = leer.next();
        
        Mascota m = new Mascota(apodo,tipo, nombre);  
        
        //mascotas.add(m);
    
        return m;    
    }
    
    public void agregarMascota(Mascota m){
        mascotas.add(m);
    }
    
    public void actualizarMascota(int index){
        
        if(index <= (mascotas.size() - 1)){
        System.out.println("");
        System.out.println("---------Actualizar---------");
        
        Mascota m = mascotas.get(index);
        m.setApodo("Roberto");
        
        //O tambien
//        Mascota m = crearMascota();
//        
//        mascotas.set(index, m);
        }else{
            System.out.println("El indice es erroneo");
        }
    }
    
    public void eliminarMascota(int index){
        if(index <= (mascotas.size() - 1)){
        mascotas.remove(index);
        }else{
            System.out.println("Fallo al eliminar. El indice es erroneo");
        }
    
    }
    
    public void eliminarMascotaPorNombre(String nombre){
        
        for (int i = 0; i < mascotas.size(); i++){
        
            Mascota m = mascotas.get(i);
            if (m.getNombre().equals(nombre)) {
                mascotas.remove(i);
            }
        }
    }
        
    
    public void mostrarMascotas(){
    
        System.out.println("Las mascotas actuales de la Lista Mascotas son: ");
        for(Mascota aux : mascotas){
            System.out.println(aux.toString());
        }
        System.out.println("Cantidad = " + mascotas.size());
    }
    
    public void fabricaChiquitos(int cantidad){
        
        for (int i = 0; i < cantidad; i++) {
              
            mascotas.add(new Mascota("Fer", "Chiquito", "Beagle"));
        }
    }
    
    public void fabricaMascota(int cantidad){
        for (int i = 0; i <cantidad; i++) {
            Mascota mascotaCreada = crearMascota();
            
            agregarMascota(mascotaCreada);
            
            System.out.println(mascotaCreada.toString());
        }
    }
    
    public void actualizarMascotaPorNombre(String nombreViejo, String nombreNuevo){
        
        for(int i = 0; i < mascotas.size(); i++){
            Mascota m = mascotas.get(i);
            
            if(m.getNombre().equals(nombreViejo)){
                m.setNombre(nombreNuevo);
            }
        }
    }
    
}
