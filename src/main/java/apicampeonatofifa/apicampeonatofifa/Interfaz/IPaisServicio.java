package apicampeonatofifa.apicampeonatofifa.Interfaz;

import java.util.List;
import apicampeonatofifa.apicampeonatofifa.Modelo.Pais;

public interface IPaisServicio {

    public List<Pais> listar();

    public List<Pais> buscar(String Pais);

    public Pais obtener(Long id);

    public Pais guardar(Pais pais);

    public boolean eliminar(Long id);
    
}
