package apicampeonatofifa.apicampeonatofifa.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apicampeonatofifa.apicampeonatofifa.Interfaz.IFaseServicio;
import apicampeonatofifa.apicampeonatofifa.Modelo.Fase;
import apicampeonatofifa.apicampeonatofifa.Repositorio.FaseRepositorio;

@Service
public class FaseServicio implements IFaseServicio{
    
    @Autowired
    private FaseRepositorio repositorio;

    @Override
    public List<Fase> listar() {
        return repositorio.findAll();
    }

    @Override
    public Fase obtener(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public List<Fase> buscar(String fase){
        return repositorio.buscar(fase);
    }
    
    @Override
    public Fase guardar(Fase fase) {
        return repositorio.save(fase);
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
