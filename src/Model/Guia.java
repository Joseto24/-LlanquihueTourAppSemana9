
package Model;

/**
 *
 * @author Xoma
 */
public class Guia extends Persona implements Registrable{
    
    private String especialidad;
    private Tour tour;

    public Guia(String clasificacion, String nombre, String especialidad, Tour tour) {
        super(clasificacion, nombre);
        this.especialidad = especialidad;
        this.tour = tour;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }
    
    
    @Override
    public String registrar() {
    return "Registrar guía: " + getNombre();
}


@Override
public String toString() {
    return "\nGuia: " + getNombre() +
           " | Especialidad: " + especialidad +
           " | Tour: " + (tour != null ? tour.getNombreTour() : "Sin tour asignado");
}

    @Override
    public String mostrarResumen() {
        return null;
    }
    
    
}
