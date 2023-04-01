package apicampeonatofifa.apicampeonatofifa.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apicampeonatofifa.apicampeonatofifa.Interfaz.IPaisServicio;
import apicampeonatofifa.apicampeonatofifa.Modelo.Pais;
import apicampeonatofifa.apicampeonatofifa.Repositorio.PaisRepositorio;

@Service
public class PaisServicio implements IPaisServicio{
    
    @Autowired
    private PaisRepositorio repositorio;

    @Override
    public List<Pais> listar() {
        return repositorio.findAll();
    }

    @Override
    public Pais obtener(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public List<Pais> buscar(String pais){
        return repositorio.buscar(pais);
    }
    
    @Override
    public Pais guardar(Pais pais) {
        return repositorio.save(pais);
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
