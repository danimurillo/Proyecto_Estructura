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
public class Personas {
    //atributos de la clase
    private String nombre;
    private char prioridad;
    private int numeroFila;
    private int tiempoTrami;
    
    
//metodo constructor de la clase
    public Personas( String nombre) {
        this.nombre = nombre;
    }
    
//metodos set y get de los atributos de la clase
   public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(char prioridad) {
        this.prioridad = prioridad;
    }

    public int getNumFila() {
        return numeroFila;
    }

    public void setNumFila(int numFila) {
        this.numeroFila = numFila;
    }
    public int getTiempoTramite() {
        return tiempoTrami;
    }
    public void setTiempoTramite(int tiempoTramite) {
        this.tiempoTrami = tiempoTramite;
    }
    /**
     * Método toString de la persona
     * @return: al informacion de la persona
     */
    @Override
    public String toString() {
        return nombre + "       " + prioridad + numeroFila+",    tiempo: "+ tiempoTrami;
    }
}
