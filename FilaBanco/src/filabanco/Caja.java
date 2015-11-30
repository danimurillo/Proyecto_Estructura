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
    /**
     * Método Constructor de la Clase Caja
     * @param Nom:  formar un nombre
     */
    public Caja(String Nom) {
        this.ocupado = false;
        personas = new Lista();
        nombre = Nom;
    }

     /**
     *
     * @return: Método que indica que el cajero se encuetra ocupado
     */
    public boolean cajeroOcupado() {
     return ocupado;
    }
   
    /*
     * @param ocupado: entra un dato donde indica si el cajero esta ocupado o no
     */
    public void setcajeroOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
}

    

