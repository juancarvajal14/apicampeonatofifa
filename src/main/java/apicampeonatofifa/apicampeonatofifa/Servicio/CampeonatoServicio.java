package apicampeonatofifa.apicampeonatofifa.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apicampeonatofifa.apicampeonatofifa.Interfaz.ICampeonatoServicio;
import apicampeonatofifa.apicampeonatofifa.Modelo.Campeonato;
import apicampeonatofifa.apicampeonatofifa.Repositorio.CampeonatoRepositorio;

@Service
public class CampeonatoServicio implements ICampeonatoServicio{
    
    @Autowired
    private CampeonatoRepositorio repositorio;

    @Override
    public List<Campeonato> listar() {
        return repositorio.findAll();
    }

    @Override
    public Campeonato obtener(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public List<Campeonato> buscar(String campeonato){
        return repositorio.buscar(campeonato);
    }
    
    @Override
    public Campeonato guardar(Campeonato campeonato) {
        return repositorio.save(campeonato);
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
