package apicampeonatofifa.apicampeonatofifa.Interfaz;

import java.util.List;
import apicampeonatofifa.apicampeonatofifa.Modelo.Fase;

public interface IFaseServicio {

    public List<Fase> listar();

    public List<Fase> buscar(String fase);

    public Fase obtener(Long id);

    public Fase guardar(Fase fase);

    public boolean eliminar(Long id);
    
}
