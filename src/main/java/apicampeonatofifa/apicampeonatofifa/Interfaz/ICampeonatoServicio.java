package apicampeonatofifa.apicampeonatofifa.Interfaz;

import java.util.List;
import apicampeonatofifa.apicampeonatofifa.Modelo.Campeonato;

public interface ICampeonatoServicio {

    public List<Campeonato> listar();

    public List<Campeonato> buscar(String campeonato);

    public Campeonato obtener(Long id);

    public Campeonato guardar(Campeonato campeonato);

    public boolean eliminar(Long id);
    
}
