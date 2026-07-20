
package Data;

import Model.Cliente;
import Model.Direccion;
import Model.Guia;
import Model.Persona;
import Model.Tour;

/**
 *
 * @author Xoma
 */
public class GestordeUsuarios {
    
    public Direccion crearDireccion1() {
        return new Direccion("Los Acacios", "106", "San Pedro", "BioBio");
    }
    
    public Tour crearTour1() {
        return new Tour(1, "Atardecer acuatico", 10000);
    }
    
    public Tour crearTour2(){
        return new Tour(2, "Ruta Desembocadura", 5000);
    }
    
    public Tour crearTour3(){
        return new Tour(3, "Paracaidismo", 30000);
    }
    
    public Cliente crearCliente1(){
        return new Cliente("Cliente", "Jose Cornejo", "20.996.617-4", "jt.cornejo@duoc.cl", crearDireccion1(), 1);
    }
    

    
    
}
