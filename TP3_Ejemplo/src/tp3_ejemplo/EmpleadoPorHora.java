/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_ejemplo;

/**
 *
 * @author profeblas
 */
public class EmpleadoPorHora extends Empleado {
    private int horas;
    private double valor;

    public EmpleadoPorHora() {
        System.out.println("Subclase Por Hora sin parametro.-");
    }

    public EmpleadoPorHora(int horas, double valor) {
        System.out.println("Subclase Por Hora CON parametro.-");
        this.horas = horas;
        this.valor = valor;
    }

    public EmpleadoPorHora(int horas, double valor, String nombre, 
            String dpto, String puesto) {
        super(nombre, dpto, puesto);
        this.horas = horas;
        this.valor = valor;
        System.out.println("Subclase Por Hora y super CON parametros .-");
    }

    public int getHoras() {
        return horas;
    }

    public double getValor() {
        return valor;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}

