package apicampeonatofifa.apicampeonatofifa.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apicampeonatofifa.apicampeonatofifa.Interfaz.IEstadioServicio;
import apicampeonatofifa.apicampeonatofifa.Modelo.Estadio;
import apicampeonatofifa.apicampeonatofifa.Repositorio.EstadioRepositorio;

@Service
public class EstadioServicio implements IEstadioServicio {
    
    @Autowired
    private EstadioRepositorio repositorio;

    @Override
    public List<Estadio> listar() {
        return repositorio.findAll();
    }

    @Override
    public Estadio obtener(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public List<Estadio> buscar(String estadio){
        return repositorio.buscar(estadio);
    }
    
    @Override
    public Estadio guardar(Estadio estadio) {
        return repositorio.save(estadio);
    }

    @Override
    public boolean eliminar(Long id) {
        try {
            repositorio.deleteById(id);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    
}
