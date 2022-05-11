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
public class Autobus extends Vehiculo {
  private int cantAsiento;
  private float precioAsiento;

    public Autobus(String patente, String marca) {
        super(patente, marca);
    }

    public Autobus(int cantAsiento, float precioAsiento, String patente, String marca) {
        super(patente, marca);
        this.cantAsiento = cantAsiento;
        this.precioAsiento = precioAsiento;
    }

   

    public int getCantAsiento() {
        return cantAsiento;
    }

    public float getPrecioAsiento() {
        return precioAsiento;
    }

    public void setCantAsiento(int cantAsiento) {
        this.cantAsiento = cantAsiento;
    }

    public void setPrecioAsiento(float precioAsiento) {
        this.precioAsiento = precioAsiento;
    }
public float totalRecaudado(int cantPaNin, int cantipaNor, int cantPaJu ){
float ni,no,ju=0;
ni=this.getPrecioAsiento()* (float)0.75;
ju=this.getPrecioAsiento()*(float)0.50;
no=this.getPrecioAsiento();
return((ni* cantPaNin)+(no*cantipaNor)+(cantPaJu* ju));
}

    @Override
    public String toString() {
        return "Autobus{" + "cantAsiento=" + cantAsiento + ", precioAsiento=" + precioAsiento + '}';
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
        final Autobus other = (Autobus) obj;
        if (this.cantAsiento != other.cantAsiento) {
            return false;
        }
        if (Float.floatToIntBits(this.precioAsiento) != Float.floatToIntBits(other.precioAsiento)) {
            return false;
        }
        return true;
    }




}