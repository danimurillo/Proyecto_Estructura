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
    public Nodo primero;//el primer nodo
    public Nodo ultimo;// el ultimo nodo
    public int tamaño;// tamaño de la lista

    //método constructor
    public Lista() {
        this.primero = this.ultimo = null;//primero y ultimo nodo inicia en null
        this.tamaño = 0;
    }

    //método que agrege al inicio de la lista
   public boolean insertarDato(Personas Dato) {
        Nodo nuevoNodo = new Nodo(Dato);
       boolean retorno = true;
        try {
            if (this.primero == null) {//si la lista esta vacia hacelo lo siguiente:
                this.primero = nuevoNodo;//Crea un nuevo nodo
                }else { //sino  crea un nodo de primero y el otro de segundo
               nuevoNodo.siguiente = this.primero;
                this.primero = nuevoNodo;
            }tamaño++;//aumenta  el tamaño de la lista
        } catch (Exception e) { //si hay un error va a retornar false
            retorno = false;
        }
        return (retorno); //Retorna verdadero o falso
    }
   public boolean borrarDato() {// borra el último elemento de la lista
        boolean retorno = true;
        if (this.primero == null) {//si la lista está vacía no puede borrar entonse reetorna un false
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
    
    //método toString
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
