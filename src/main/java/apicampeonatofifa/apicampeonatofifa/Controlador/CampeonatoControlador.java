package apicampeonatofifa.apicampeonatofifa.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import apicampeonatofifa.apicampeonatofifa.Interfaz.ICampeonatoServicio;
import apicampeonatofifa.apicampeonatofifa.Modelo.Campeonato;

@RestController
@RequestMapping("/campeonatos")
public class CampeonatoControlador {

    @Autowired
    private ICampeonatoServicio servicio;

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Campeonato> listar() {
        return servicio.listar();
    }

    @RequestMapping(value = "/obtener/{id}", method = RequestMethod.GET)
    public Campeonato obtener(@PathVariable Long id) {
        return servicio.obtener(id);
    }

    @RequestMapping(value = "/buscar/{campeonato}", method = RequestMethod.GET)
    public List<Campeonato> buscar(@PathVariable String campeonato) {
        return servicio.buscar(campeonato);
    }

    @RequestMapping(value = "/agregar", method = RequestMethod.POST)
    public Campeonato crear(@RequestBody Campeonato campeonato) {
        return servicio.guardar(campeonato);
    }

    @RequestMapping(value = "/modificar", method = RequestMethod.PUT)
    public Campeonato actualizar(@RequestBody Campeonato campeonato) {
        if (servicio.obtener(campeonato.getId()) != null) {
            return servicio.guardar(campeonato);
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
