package apicampeonatofifa.apicampeonatofifa.Interfaz;

import java.util.List;
import apicampeonatofifa.apicampeonatofifa.Modelo.Encuentro;

public interface IEncuentroServicio {

    public List<Encuentro> listar();

    public List<Encuentro> buscar(Long id);

    public Encuentro obtener(Long id);

    public Encuentro guardar(Encuentro encuentro);

    public boolean eliminar(Long id);
    
}
