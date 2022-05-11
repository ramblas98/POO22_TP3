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
public class Camion extends Vehiculo{
    private int compartimientos;
    private int capacidadPeso;

    public Camion(int compartimientos, int capacidadPeso, String patente, String marca) {
        super(patente, marca);
        this.compartimientos = compartimientos;
        this.capacidadPeso = capacidadPeso;
    }

    public Camion(String patente, String marca) {
        super(patente, marca);
    }

   


    public int getCompartimientos() {
        return compartimientos;
    }

    public int getCapacidadPeso() {
        return capacidadPeso;
    }

    public void setCompartimientos(int compartimientos) {
        this.compartimientos = compartimientos;
    }

    public void setCapacidadPeso(int capacidadPeso) {
        this.capacidadPeso = capacidadPeso;
    }
    public float pesoPorCompartimiento(){
       return(this.getCapacidadPeso()/this.getCompartimientos());
  
    
    }
    
    public String marcaCantComp(){
     String  g;
       g= this.getCompartimientos()+ this.getPatente();
      return g;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Camion other = (Camion) obj;
        if (this.compartimientos != other.compartimientos) {
            return false;
        }
        if (this.capacidadPeso != other.capacidadPeso) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Camion{" + "compartimientos=" + compartimientos + ", capacidadPeso=" + capacidadPeso + '}';
    }
    
}
