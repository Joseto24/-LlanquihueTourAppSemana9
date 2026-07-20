
package Model;

/** Esta clase representa una super clase.
 *
 * @author Xoma
 */
public class Persona {
     
    private String nombre;
    private String clasificacion;

    
    /**
     * 
     * @param nombre Representa el nombre de la persona.
     * @param clasificacion Representa que es la persona (Guia, Cliente, Recepcionista).
     */
    public Persona(String clasificacion, String nombre) {
        this.nombre = nombre;
        this.clasificacion = clasificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    
    
    
    
    
}
