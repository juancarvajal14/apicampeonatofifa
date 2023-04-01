package apicampeonatofifa.apicampeonatofifa.Interfaz;

import java.util.List;
import apicampeonatofifa.apicampeonatofifa.Modelo.Estadio;

public interface IEstadioServicio {

    public List<Estadio> listar();

    public List<Estadio> buscar(String estadio);

    public Estadio obtener(Long id);

    public Estadio guardar(Estadio estadio);

    public boolean eliminar(Long id);
    
}
