package apicampeonatofifa.apicampeonatofifa.Repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import apicampeonatofifa.apicampeonatofifa.Modelo.Ciudad;

@Repository
public interface CiudadRepositorio extends JpaRepository<Ciudad, Long> {
    
    @Query("SELECT c FROM Ciudad c where c.ciudad LIKE '%'|| ?1 || '%' ")
    List<Ciudad> buscar(String ciudad);
    
}
