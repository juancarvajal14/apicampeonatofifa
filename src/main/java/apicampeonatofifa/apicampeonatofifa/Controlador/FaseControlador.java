package apicampeonatofifa.apicampeonatofifa.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import apicampeonatofifa.apicampeonatofifa.Interfaz.IFaseServicio;
import apicampeonatofifa.apicampeonatofifa.Modelo.Fase;

@RestController
@RequestMapping("/fases")
public class FaseControlador {

    @Autowired
    private IFaseServicio servicio;

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Fase> listar() {
        return servicio.listar();
    }

    @RequestMapping(value = "/obtener/{id}", method = RequestMethod.GET)
    public Fase obtener(@PathVariable Long id) {
        return servicio.obtener(id);
    }

    @RequestMapping(value = "/buscar/{fase}", method = RequestMethod.GET)
    public List<Fase> buscar(@PathVariable String fase) {
        return servicio.buscar(fase);
    }

    @RequestMapping(value = "/agregar", method = RequestMethod.POST)
    public Fase crear(@RequestBody Fase fase) {
        return servicio.guardar(fase);
    }

    @RequestMapping(value = "/modificar", method = RequestMethod.PUT)
    public Fase actualizar(@RequestBody Fase fase) {
        if (servicio.obtener(fase.getId()) != null) {
            return servicio.guardar(fase);
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
