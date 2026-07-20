
package Model;

/**
 *
 * @author Xoma
 */
public class Direccion {
    
    private String calle;
    private String numero;
    private String comuna;
    private String region;

    public Direccion(String calle, String numero, String comuna, String Region) {
        this.calle = calle;
        this.numero = numero;
        this.comuna = comuna;
        this.region = Region;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String Region) {
        this.region = Region;
    }
    
    
    @Override
public String toString() {
    return calle + " " + numero + ", " + comuna + ", " + region;
}
    
}
