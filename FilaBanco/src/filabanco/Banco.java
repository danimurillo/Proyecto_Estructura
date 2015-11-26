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
  
    /**
     * Método que crea la Fila
     * @param cl: Variable de Tipo Cliente
     */
    
    public void crearFila(Personas cl){ 
    int prio = (int) (Math.random() * 3 + 1);
        int tiemp = (int) (Math.random() * (11 - 2) + 2);
        int nombre = (int) (Math.random() * 9 + 1);
        switch (prio) { //Orden de Prioridades
            case 1:
                cl.setPrioridad('A');
                cl.setNumFila(contador);
                cl.setNombre(this.nom[nombre]);
                contador++;
                break;
            case 2:
                cl.setPrioridad('B');
                cl.setNumFila(contador);
                while (nombre != 2 && nombre != 3 && nombre != 5 && nombre != 9) {
                    nombre = (int) (Math.random() * 9 + 1);
                }
                cl.setNombre(this.nom[nombre]);
                contador++;
                break;
            case 3:
                cl.setPrioridad('C');
                cl.setNumFila(contador);
                cl.setNombre(this.nom[nombre]);
                contador++;
                break;
        }
        cl.setTiempoTramite(tiemp);
        fila.insertarDato(cl); //Agrega Clientes a la Fila
    }
    
    //--------------------------se da el tiempo de atencion de cada caja-----------------------------------------------
      //metodo que retorna los usuarios atendidos por cada cajero y el tiempo total
    /**
     * Método que promedia el tiempo de atención de las cajas
     * @param caj: Variable de Tipo "Caja"
     * @return: Retorna los datos ordenados sobre la atención en la caja
     */
    
    public String promedioCajero(Caja caj){
        
         String retorno = "";
        int tiempoTotal = 0;
        Nodo temp = caj.personas.primero;
        for (int i = 0; i < caj.personas.tamaño; i++) {
            tiempoTotal = tiempoTotal + temp.dato.getTiempoTramite();
            temp = temp.siguiente;
        }
        retorno =  caj.nombre + "\n" + " Total de clientes atendidos : " + caj.personas.tamaño + "\n" + " Tiempo total : "
                + tiempoTotal + " minutos" + "\n" + "Promedio : " + (tiempoTotal / caj.personas.tamaño) + " cliente" + "\n\n";
        return (retorno);
      
 }
    //------------------------------ordena las personas por prioridad--------------------------------------------------
    public void ordenarFia(){
    } 
}
