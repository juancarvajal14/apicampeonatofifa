package apicampeonatofifa.apicampeonatofifa.Repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import apicampeonatofifa.apicampeonatofifa.Modelo.Estadio;

@Repository
public interface EstadioRepositorio extends JpaRepository<Estadio, Long>{
    
    @Query("SELECT e FROM Estadio e where e.estadio LIKE '%'|| ?1 || '%' ")
    List<Estadio> buscar(String estadio);
    
}
