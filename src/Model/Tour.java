
package Model;

/**
 *
 * @author Xoma
 */
public class Tour {
    
    
    private int numeroCatalogo;
    private String nombreTour;
    private int precio;
    

    public Tour(int numeroCatalogo, String nombreTour, int precio) {
        this.numeroCatalogo = numeroCatalogo;
        this.nombreTour = nombreTour;
        this.precio = precio;
    }

    public int getNumeroCatalogo() {
        return numeroCatalogo;
    }

    public void setNumeroCatalogo(int numeroCatalogo) {
        this.numeroCatalogo = numeroCatalogo;
    }

    public String getNombreTour() {
        return nombreTour;
    }

    public void setNombreTour(String nombreTour) {
        this.nombreTour = nombreTour;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
  
    
    @Override
public String toString() {
    return "Tour" + numeroCatalogo + ": " + nombreTour +
           " | Precio: $" + precio;
}
    
    
}
