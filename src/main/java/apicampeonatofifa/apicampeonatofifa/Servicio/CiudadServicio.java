package apicampeonatofifa.apicampeonatofifa.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apicampeonatofifa.apicampeonatofifa.Interfaz.ICiudadServicio;
import apicampeonatofifa.apicampeonatofifa.Modelo.Ciudad;
import apicampeonatofifa.apicampeonatofifa.Repositorio.CiudadRepositorio;

@Service
public class CiudadServicio implements ICiudadServicio {

    @Autowired
    private CiudadRepositorio repositorio;

    @Override
    public List<Ciudad> listar() {
        return repositorio.findAll();
    }

    @Override
    public Ciudad obtener(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public List<Ciudad> buscar(String ciudad){
        return repositorio.buscar(ciudad);
    }
    
    @Override
    public Ciudad guardar(Ciudad ciudad) {
        return repositorio.save(ciudad);
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
