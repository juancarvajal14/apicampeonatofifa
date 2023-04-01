package apicampeonatofifa.apicampeonatofifa.Interfaz;

import java.util.List;
import apicampeonatofifa.apicampeonatofifa.Modelo.Grupo;

public interface IGrupoServicio {

    public List<Grupo> listar();

    public List<Grupo> buscar(String Grupo);

    public Grupo obtener(Long id);

    public Grupo guardar(Grupo grupo);

    public boolean eliminar(Long id);
    
}
