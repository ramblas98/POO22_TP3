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
public class Integrante {
    private int edad;
    private int id;
    private String nombre;
    private String apellido;

    public Integrante() {
    }

    public Integrante(int edad, String nombre, String apellido) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    
    
    public void viajar(){
    System.out.println("debe viajar");
    
    }
     public void concentrarse(){
    System.out.println("debe concentrarse");
    

}
    //getter

    public int getEdad() {
        return edad;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    //setter

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
     
 }
