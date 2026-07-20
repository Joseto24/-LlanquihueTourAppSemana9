
package App;

import Data.GestordeUsuarios;
import Model.Cliente;
import Model.Direccion;
import Model.Guia;
import Model.Persona;
import Model.Registrable;
import Model.Tour;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Xoma
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        GestordeUsuarios gestor = new GestordeUsuarios();
        
        Direccion direc1 = gestor.crearDireccion1();
        
        Tour tour1 = gestor.crearTour1();
        Tour tour2 = gestor.crearTour2();
        Tour tour3 = gestor.crearTour3()
                ;
        Persona cliente1 = gestor.crearCliente1();
        
        Guia guia1 = new Guia("Guia", "Javier Cardenas", "Deportes acuaticos", tour1);
        
        List<Registrable> registros = new ArrayList<>();
        registros.add((Registrable) cliente1);

        // Mostrar datos
        for (Registrable r : registros) {
            r.registrar();
            r.mostrarResumen();
        }

        // Mostrar catálogo de tours
        System.out.println("\n------Catalogo de Tours------");
        System.out.println(tour1);
        System.out.println(tour2);
        System.out.println(tour3);
        
        System.out.println(cliente1);
        
        System.out.println(guia1);
    }
    
    
}
