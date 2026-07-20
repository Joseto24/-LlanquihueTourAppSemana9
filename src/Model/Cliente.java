
package Model;

/**
 *
 * @author Xoma
 */
public class Cliente extends Persona implements Registrable{
    
    private String rut;
    private String correo;
    private Direccion direccion;
    private int numeroTour;

    public Cliente(String clasificacion, String nombre, String rut, String correo, Direccion direccion, int numeroTour) {
        super(clasificacion, nombre);
        this.rut = rut;
        this.correo = correo;
        this.direccion = direccion;
        this.numeroTour = numeroTour;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public int getNumeroTour() {
        return numeroTour;
    }

    public void setNumeroTour(int numeroTour) {
        this.numeroTour = numeroTour;
    }

    
    @Override
    public String registrar() {
        return "Registrar cliente: " + getNombre();
}


@Override
public String toString() {
    return "\nCliente: " + getNombre() +
           " | RUT: " + rut +
           " | Correo: " + correo +
           " | Direccion: " + (direccion != null ? direccion.toString() : "Sin dirección") +
           " | Tour: " + numeroTour;
}

    @Override
    public String mostrarResumen() {
        System.out.println("Resumen Cliente: " + getNombre() + " | RUT: " + rut);
        return null;
    }
    

    
}
