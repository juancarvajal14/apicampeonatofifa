package apicampeonatofifa.apicampeonatofifa.Repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import apicampeonatofifa.apicampeonatofifa.Modelo.Encuentro;

@Repository
public interface EncuentroRepositorio extends JpaRepository<Encuentro, Long> {

    @Query("SELECT e FROM Encuentro e where e.encuentro LIKE '%'|| ?1 || '%' ")
    List<Encuentro> buscar(String encuentro);
    
}
