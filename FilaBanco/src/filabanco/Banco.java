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
public class Banco {
   //atributos de la clase
    public Lista fila;
    public int contador;
    public String[] nom = new String[20];// Arreglo donde se guardan los nombre de la fila
    
    //metodo constructor de la clase
    public Banco() {
        fila = new Lista(); //Arreglo para una Fila de Espera en el Banco
        contador = 1;
        //Nombres cualesquiera elegidos aleatoriamente, previamente determinados
        nom[0] = "Carlos";
        nom[1] = "Julio";
        nom[2] = "Allan";
        nom[3] = "Jose";
        nom[4] = "Lis";
        nom[5] = "Daniel";
        nom[6] = "Steven";
        nom[7] = "Pablo";
        nom[8] = "Jonathan";
        nom[9] = "Estefani";
        nom[10] = "Deiver";
        nom[12] = "Guido";
        nom[13] = "Ana";
        nom[14] = "Maria";
        nom[15] = "Maria Fernanda";
        nom[16] = "Carla";
        nom[17] = "Julia"; 
        nom[18] = "Gabriela";
        nom[19] = "Liseth";
        
    }
    //------//donde se crea la fila, se da la prioridad y se elige el tiempo de atencion------------------------------
    
    public void crearFila(String Personas){ 
    }
    
    //--------------------------se da el tiempo de atencion de cada caja-----------------------------------------------
    public String promedioCajero(){
       return "";
 }
    //------------------------------ordena las personas por prioridad--------------------------------------------------
    public void ordenarFia(){
    } 
}
