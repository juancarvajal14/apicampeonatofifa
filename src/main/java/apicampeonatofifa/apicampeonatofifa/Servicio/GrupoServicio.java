package apicampeonatofifa.apicampeonatofifa.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apicampeonatofifa.apicampeonatofifa.Interfaz.IGrupoServicio;
import apicampeonatofifa.apicampeonatofifa.Modelo.Grupo;
import apicampeonatofifa.apicampeonatofifa.Repositorio.GrupoRepositorio;

@Service
public class GrupoServicio implements IGrupoServicio{
    
    @Autowired
    private GrupoRepositorio repositorio;

    @Override
    public List<Grupo> listar() {
        return repositorio.findAll();
    }

    @Override
    public Grupo obtener(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public List<Grupo> buscar(String grupo){
        return repositorio.buscar(grupo);
    }
    
    @Override
    public Grupo guardar(Grupo grupo) {
        return repositorio.save(grupo);
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
