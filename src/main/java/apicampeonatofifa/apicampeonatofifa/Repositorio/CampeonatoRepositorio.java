package apicampeonatofifa.apicampeonatofifa.Repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import apicampeonatofifa.apicampeonatofifa.Modelo.Campeonato;

@Repository
public interface CampeonatoRepositorio extends JpaRepository<Campeonato, Long>{
    
    @Query("SELECT ca FROM Campeonato ca where ca.campeonato LIKE '%' || ?1 || '%' ")
    List<Campeonato> buscar(String campeonato);

}
