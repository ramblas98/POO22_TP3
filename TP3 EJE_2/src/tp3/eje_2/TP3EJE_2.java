/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.eje_2;

/**
 *
 * @author alumno
 */
public class TP3EJE_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
  //  Vehiculo a= new Vehiculo("hza 878","volvo");
    Camion   b= new Camion(10,160,"hfg 548","zuzuki");
    Autobus  c= new Autobus(65,150,"gtr 456","metalpar");
    Camion  a= new Camion (5,20,"gtr 158","mercedes bensz");
    Camion  d=new Camion(10,160,"hfg 548","zuzuki");
    Autobus e= new Autobus(50,200,"gtr","buspark");
    Autobus f=new Autobus(65,150,"gtr 456","metalpar");
    if(a.equals(b))
          System.out.println("True");
         else
        System.out.println("False");
    
    if(b.equals(d))
           System.out.println("True");
         else
        System.out.println("False");
   if (c.equals(f))
     System.out.println("True");
         else
        System.out.println("False");
    
   
    if(c.equals(e))
          System.out.println("True");
         else
        System.out.println("False");

    System.out.println( a.toString());
    System.out.println( b.toString());
    System.out.println( c.toString());
    System.out.println( d.toString());
    System.out.println( e.toString());
    System.out.println( f.toString());

            }

}
