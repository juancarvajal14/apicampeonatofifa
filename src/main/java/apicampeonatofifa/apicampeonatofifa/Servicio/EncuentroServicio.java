package apicampeonatofifa.apicampeonatofifa.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apicampeonatofifa.apicampeonatofifa.Interfaz.IEncuentroServicio;
import apicampeonatofifa.apicampeonatofifa.Modelo.Encuentro;
import apicampeonatofifa.apicampeonatofifa.Repositorio.EncuentroRepositorio;

@Service
public class EncuentroServicio implements IEncuentroServicio {

    @Autowired
    private EncuentroRepositorio repositorio;

    @Override
    public List<Encuentro> listar() {
        return repositorio.findAll();
    }

    @Override
    public Encuentro obtener(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public List<Encuentro> buscar(Long id){
        return repositorio.buscar(id);
    }
    
    @Override
    public Encuentro guardar(Encuentro encuentro) {
        return repositorio.save(encuentro);
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
