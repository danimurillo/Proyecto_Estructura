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
public class Lista {
    //atributos de la clase
    public Nodo primero;//
    public Nodo ultimo;// el ultimo nodo
    public int tamaño;// tamaño de la lista

    //método constructor
    public Lista() {
        this.primero = this.ultimo = null;//primero y ultimo nodo inicia en null
        this.tamaño = 0;
    }
    /**
     * Método que inserta los datos de la personas 
     * @param Dato: la informacion que se recibe del Nodo
     * @return: returna falso o verdadero, sobre el estado del nodo agregado
     */
   public boolean insertarDato(Personas Dato) {
        Nodo nuevoNodo = new Nodo(Dato);
       boolean retorno = true;
        try {
            if (this.primero == null) {
                this.primero = nuevoNodo;
                }else { 
               nuevoNodo.siguiente = this.primero;
                this.primero = nuevoNodo;
            }tamaño++;
        } catch (Exception e) {
            retorno = false;
        }
        return (retorno); //Retorna verdadero o falso
    }
   /**
     * Método que borra el Nodo en la Lista
     * @return: Dato falso ó verdadero, sobre el estado del nodo Borrado
     */
   public boolean  borrarDato() {
        boolean retorno = true;
        if (this.primero == null) {
            retorno = false;
        } else {//en caso de que la lista tenga datos
            if (this.primero == this.ultimo) {//si la lista tiene únicamente un elemento
                this.primero = this.ultimo = null;
            } //si la lista tiene más de un elemento
            else {
                Nodo actual = this.primero;
                this.primero = actual.siguiente;
                actual = null;
            
            }
            this.tamaño--; //disminulle tamaño la lista
        }

        return (retorno); //Devuelve falso o verdadero
    }
    /**
     * Método toString
     * @return: muestra el contenido almacenado en los nodos
     */
     @Override
    public String toString() {
        String retorno = "";
        Nodo temp = this.primero;
        for (int i = 0; i < this.tamaño; i++) {
            retorno = retorno + String.valueOf(temp.dato.toString()) + "\n";
            temp = temp.siguiente;
        }
        return (retorno);
    }
    
}
