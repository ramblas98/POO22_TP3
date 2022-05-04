/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_ejemplo;

/**
 *
 * @author profeblas
 */
public class EmpleadoAsalariado extends Empleado{
    private double sueldo;

    public EmpleadoAsalariado() {
        System.out.println("Subclase Asalariado sin parametros.-");
    }

    public EmpleadoAsalariado(double sueldo) {
        System.out.println("Subclase Asalariado CON parametro.-");
        this.sueldo = sueldo;
    }

    public EmpleadoAsalariado(double sueldo, String nombre, 
            String dpto, String puesto) {
        super(nombre, dpto, puesto);
        this.sueldo = sueldo;
        System.out.println("Subclase Asalariado y super CON parametros .-");
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
}

