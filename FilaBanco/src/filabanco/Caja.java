/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filabanco;

/**
 *
 * @author Hellen Lopez A y Daniel Murillo 
 */
public class Caja {
        //atributos de la clase
    public Lista personas;
    public String nombre;
    private boolean ocupado;
    
//metodo constructor de la clase
    public Caja(String pNombre) {
        this.ocupado = false;
        personas = new Lista();
        nombre = pNombre;
    }
//metodos set y get de los atributos de la clase
    public boolean cajeroOcupado() {//Método que indica que el cajero se encuetra ocupado
     return ocupado;
    }

    public void setcajeroOcupado(boolean ocupado) {//entra un dato donde indica si el cajero esta ocupado o no
        this.ocupado = ocupado;
    } 
}
    
}
