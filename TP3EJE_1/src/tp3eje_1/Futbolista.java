/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3eje_1;

/**
 *
 * @author alumno
 */
public class Futbolista extends Integrante {
    private String puesto;
    private int peso;

    public Futbolista() {
    }

    public Futbolista(String puesto, int peso) {
        this.puesto = puesto;
        this.peso = peso;
    }

    public Futbolista(String puesto, int peso, int edad, String nombre, String apellido) {
       // super(edad, nombre, apellido);
        this.puesto = puesto;
        this.peso = peso;
    }
    
       
   public void jugarpartido(){
   System.out.println("debe jugar partido");
   
   }    

    public String getPuesto() {
        return puesto;
    }

    public int getPeso() {
        return peso;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }


}
