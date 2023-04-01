package apicampeonatofifa.apicampeonatofifa.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import apicampeonatofifa.apicampeonatofifa.Interfaz.ICiudadServicio;
import apicampeonatofifa.apicampeonatofifa.Modelo.Ciudad;

@RestController
@RequestMapping("/ciudades")
public class CiudadControlador {

    @Autowired
    private ICiudadServicio servicio;

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Ciudad> listar() {
        return servicio.listar();
    }

    @RequestMapping(value = "/obtener/{id}", method = RequestMethod.GET)
    public Ciudad obtener(@PathVariable Long id) {
        return servicio.obtener(id);
    }

    @RequestMapping(value = "/buscar/{ciudad}", method = RequestMethod.GET)
    public List<Ciudad> buscar(@PathVariable String ciudad) {
        return servicio.buscar(ciudad);
    }

    @RequestMapping(value = "/agregar", method = RequestMethod.POST)
    public Ciudad crear(@RequestBody Ciudad ciudad) {
        return servicio.guardar(ciudad);
    }

    @RequestMapping(value = "/modificar", method = RequestMethod.PUT)
    public Ciudad actualizar(@RequestBody Ciudad ciudad) {
        if (servicio.obtener(ciudad.getId()) != null) {
            return servicio.guardar(ciudad);
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
