package apicampeonatofifa.apicampeonatofifa.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import apicampeonatofifa.apicampeonatofifa.Interfaz.IEstadioServicio;
import apicampeonatofifa.apicampeonatofifa.Modelo.Estadio;

@RestController
@RequestMapping("/estadios")
public class EstadioControlador {
    
    @Autowired
    private IEstadioServicio servicio;

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Estadio> listar() {
        return servicio.listar();
    }

    @RequestMapping(value = "/obtener/{id}", method = RequestMethod.GET)
    public Estadio obtener(@PathVariable Long id) {
        return servicio.obtener(id);
    }

    @RequestMapping(value = "/buscar/{estadio}", method = RequestMethod.GET)
    public List<Estadio> buscar(@PathVariable String estadio) {
        return servicio.buscar(estadio);
    }

    @RequestMapping(value = "/agregar", method = RequestMethod.POST)
    public Estadio crear(@RequestBody Estadio estadio) {
        return servicio.guardar(estadio);
    }

    @RequestMapping(value = "/modificar", method = RequestMethod.PUT)
    public Estadio actualizar(@RequestBody Estadio estadio) {
        if (servicio.obtener(estadio.getId()) != null) {
            return servicio.guardar(estadio);
        }
        else{
            return null;
        }
    }

    @RequestMapping(value = "/eliminar/{id}", method = RequestMethod.DELETE)
    public boolean eliminar(@PathVariable long id) {
        return servicio.eliminar(id);
    }
    
}
