package apicampeonatofifa.apicampeonatofifa.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import apicampeonatofifa.apicampeonatofifa.Interfaz.IEncuentroServicio;
import apicampeonatofifa.apicampeonatofifa.Modelo.Encuentro;

@RestController
@RequestMapping("/encuentros")
public class EncuentroControlador {

    @Autowired
    private IEncuentroServicio servicio;

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Encuentro> listar() {
        return servicio.listar();
    }

    @RequestMapping(value = "/obtener/{id}", method = RequestMethod.GET)
    public Encuentro obtener(@PathVariable Long id) {
        return servicio.obtener(id);
    }

    @RequestMapping(value = "/buscar/{encuentro}", method = RequestMethod.GET)
    public List<Encuentro> buscar(@PathVariable String encuentro) {
        return servicio.buscar(encuentro);
    }

    @RequestMapping(value = "/agregar", method = RequestMethod.POST)
    public Encuentro crear(@RequestBody Encuentro encuentro) {
        return servicio.guardar(encuentro);
    }

    @RequestMapping(value = "/modificar", method = RequestMethod.PUT)
    public Encuentro actualizar(@RequestBody Encuentro encuentro) {
        if (servicio.obtener(encuentro.getId()) != null) {
            return servicio.guardar(encuentro);
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
