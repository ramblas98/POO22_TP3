/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3_ejer1;

/**
 *
 * @author Matias
 */
public class IntegrantesDelEquipo {
   private int id;
   private String nombre;
   private String apellido;
   private int edad;
   
   public IntegratesDelEquipo(){
       
   }
   
   public IntegrantesDelEquipo(int id, String nombre, String apellido, int edad){
       this.id = id;
       this.nombre = nombre;
       this.apellido = apellido;
       this.edad = edad;
   }
   public int getId(){
       return id;
   }
   public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void concentrarse(){
        System.out.println("Concentro");
    }
    
    public void viajar(){
        System.out.println("Viajo");
    }
   
}
