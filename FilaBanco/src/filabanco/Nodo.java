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
public class Nodo {
    //Atribustos de la clase 
    public Nodo siguiente;
    public Personas dato;
    public Nodo primero;
// Datos es lo  que se recibe dentro del nodo
    /**
     * Método contructor del nodo
     * @param Dato = informacion que se recibe dentro del nodo
     */
    public Nodo(Personas Dato) {
        this.dato = Dato;
        siguiente = null;
    }
}
