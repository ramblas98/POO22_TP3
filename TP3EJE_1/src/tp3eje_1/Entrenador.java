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
public class Entrenador extends Integrante {
    private int idfederacion;

    public Entrenador() {
    }

    public Entrenador(int edad, String nombre, String apellido) {
        super(edad, nombre, apellido);
    }

    public Entrenador(int idfederacion) {
        this.idfederacion = idfederacion;
    }

    public Entrenador(int idfederacion, int edad, String nombre, String apellido) {
        super(edad, nombre, apellido);
        this.idfederacion = idfederacion;
    }

    
    
    
    public void dirigirpartido(){
    System.out.println("Debe dirijir partido");
    
    }
    public void debedirijirent(){
    System.out.println("debe dirijir entrenamiento");
    
    }

    public int getIdfederacion() {
        return idfederacion;
    }

    
    
}
