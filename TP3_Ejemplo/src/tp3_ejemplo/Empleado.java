/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_ejemplo;

/**
 *
 * @author profeblas
 */

public class Empleado {
    private String nombre;
    private String dpto;
    private String puesto;

    public Empleado() {
        System.out.println("Clase padre sin parametros.-");
    }

    public Empleado(String nombre, String dpto, String puesto) {
        this.nombre = nombre;
        this.dpto = dpto;
        this.puesto = puesto;
        System.out.println("Clase padre CON parametros.-");
    }

    public String getNombre() {
        return nombre;
    }

    public String getDpto() {
        return dpto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
}



