package apicampeonatofifa.apicampeonatofifa.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import apicampeonatofifa.apicampeonatofifa.Interfaz.IGrupoServicio;
import apicampeonatofifa.apicampeonatofifa.Modelo.Grupo;

@RestController
@RequestMapping("/grupos")
public class GrupoControlador {

    @Autowired
    private IGrupoServicio servicio;

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Grupo> listar() {
        return servicio.listar();
    }

    @RequestMapping(value = "/obtener/{id}", method = RequestMethod.GET)
    public Grupo obtener(@PathVariable Long id) {
        return servicio.obtener(id);
    }

    @RequestMapping(value = "/buscar/{grupo}", method = RequestMethod.GET)
    public List<Grupo> buscar(@PathVariable String grupo) {
        return servicio.buscar(grupo);
    }

    @RequestMapping(value = "/agregar", method = RequestMethod.POST)
    public Grupo crear(@RequestBody Grupo grupo) {
        return servicio.guardar(grupo);
    }

    @RequestMapping(value = "/modificar", method = RequestMethod.PUT)
    public Grupo actualizar(@RequestBody Grupo grupo) {
        if (servicio.obtener(grupo.getId()) != null) {
            return servicio.guardar(grupo);
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
