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
   
    public String[] nom = new String[20];
    
    /**
     *Método Constructor del Banco
     */
    public Banco() {
        fila = new Lista(); //Arreglo para una Fila en el Banco
        //Nombres que se utilizaran en la lista 
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
   //metodo donde se crea la fila de las personas y le asignara el tiempo y la prioridad  
    /**
     * Método que crea la Fila
     * @param cl: Es la variable del tipo  de Cliente
     */
    public void crearFila(Personas cl) {
        int nombre = (int) (Math.random() * 9 +1);
        int prioridad = (int) (Math.random() * 4 + 1);
        int tiemp = (int) (Math.random() * (3 - 21) + 21);
        switch (prioridad) { //Orden de Prioridades
            case 1:
                cl.setPrioridad('A');
                cl.setNumFila(contador);
                cl.setNombre(this.nom[nombre]);
                contador++;
                break;
            case 2:
                cl.setPrioridad('B');
                cl.setNumFila(contador);
                cl.setNombre(this.nom[nombre]);
                contador++;
                break;
            case 3:
                cl.setPrioridad('C');
                cl.setNumFila(contador);
                cl.setNombre(this.nom[nombre]);
                contador++;
                break;
            case 4:
                cl.setPrioridad('D');
                cl.setNumFila(contador);
                cl.setNombre(this.nom[nombre]);
                contador++;
                break;
        }
        cl.setTiempoTramite(tiemp);
        fila.insertarDato(cl); //Agrega Clientes a la Fila
    }

    //metodo que nos retorna las personas atendidos por cada cajero y el tiempo total
    /**
     * Método da el proemdio del tiempo de atención de las cajas
     * @param caj: Variable de Tipo "Caja"
     * @return: Retorna los datos ordenados sobre la atención en la caja
     */
    public String promedioCajero(Caja caj) {
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
    /**
     *Método que ordena las filas por su prioridad
     */
    public void ordenaFila() {
        Nodo temp = this.fila.primero;
        Personas temp1 = new Personas("");
        Personas temp2 = new Personas("");
        for (int i = 0; i < this.fila.tamaño; i++) {
            temp = this.fila.primero;
            for (int j = 0; j < this.fila.tamaño - 1; j++) {
                if (temp.dato.getNumFila() <= temp.siguiente.dato.getNumFila()) {
                    temp = temp.siguiente;
                } else if (temp.dato.getNumFila() > temp.siguiente.dato.getNumFila()) {
                    temp1 = temp.siguiente.dato;
                    temp2 = temp.dato;
                    temp.siguiente.dato = temp2;
                    temp.dato = temp1;
                    temp = temp.siguiente;
                  
                }
            }
        }
        String s = "";
        String s2 = "";
        for (int i = 0; i < this.fila.tamaño; i++) {
            temp = this.fila.primero;
            for (int j = 0; j < this.fila.tamaño - 1; j++) {
                s = "" + temp.dato.getPrioridad();
                s2 = "" + temp.siguiente.dato.getPrioridad();
                if (s.compareTo(s2) <= 0) {
                    temp = temp.siguiente;
                } else if (s.compareTo(s2) > 0) {
                    temp1 = temp.siguiente.dato;
                    temp2 = temp.dato;
                    temp.siguiente.dato = temp2;
                    temp.dato = temp1;
                    temp = temp.siguiente;
                }
            }
        }
    }
   
}
