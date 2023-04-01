package apicampeonatofifa.apicampeonatofifa.Interfaz;

import java.util.List;
import apicampeonatofifa.apicampeonatofifa.Modelo.Ciudad;

public interface ICiudadServicio {

    public List<Ciudad> listar();

    public List<Ciudad> buscar(String ciudad);

    public Ciudad obtener(Long id);

    public Ciudad guardar(Ciudad ciudad);

    public boolean eliminar(Long id);

}
