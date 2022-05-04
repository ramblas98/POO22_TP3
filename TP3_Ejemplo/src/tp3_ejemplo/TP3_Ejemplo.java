/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_ejemplo;

/**
 *
 * @author profeblas
 */
public class TP3_Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado e1 = new Empleado();
        Empleado e2 = new Empleado("Maxi","Cobranzas","Cajero");
        
        System.out.println("---");
        EmpleadoPorHora exh1 = new EmpleadoPorHora();
        EmpleadoPorHora exh2 = new EmpleadoPorHora(12,1500);
        EmpleadoPorHora exh3 = new EmpleadoPorHora(12,1500,"Leo","Ventas","Vendedor");
        
        System.out.println("---");
        EmpleadoAsalariado easa1 = new EmpleadoAsalariado();
        EmpleadoAsalariado easa2 = new EmpleadoAsalariado(60000);
        EmpleadoAsalariado easa3 = new EmpleadoAsalariado(60000,"Matias","Gerencia","Secretario");
        
    }
    
}
