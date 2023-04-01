package apicampeonatofifa.apicampeonatofifa.Repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import apicampeonatofifa.apicampeonatofifa.Modelo.Fase;

@Repository
public interface FaseRepositorio extends JpaRepository<Fase, Long>{
    
    @Query("SELECT f FROM Fase f where f.fase LIKE '%'|| ?1 || '%' ")
    List<Fase> buscar(String fase);
    
}
