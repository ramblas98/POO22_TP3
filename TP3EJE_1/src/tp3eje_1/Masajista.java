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
public class Masajista extends Integrante {
    private String titulacion;
    private int aniosExperiencia;

    
    
    public void darmasajes(){
    
    System.out.println("debe dar msasajes");
    
    }

    public Masajista(String titulacion, int aniosExperiencia) {
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public Masajista(String titulacion, int aniosExperiencia, int edad, String nombre, String apellido) {
       // super(edad, nombre, apellido);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

   
    
}
