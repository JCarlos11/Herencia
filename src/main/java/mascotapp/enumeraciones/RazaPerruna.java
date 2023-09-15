/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mascotapp.enumeraciones;

/**
 *
 * @author JCarlos
 */
public enum RazaPerruna {
 //SE les puede asignar distintos atributos a cada enumeracion 
    //EJEMPLO

   BEAGLE(123, "Beagle"), COCKER(345,"Cocker"), PITBULL(678, "Pitbull"), BORDER_COLLIE(91011, "Border Collie");
   
  private Integer codigo;
  private String valor;

    private RazaPerruna(Integer codigo, String valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
  
 
   
}
