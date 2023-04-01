package apicampeonatofifa.apicampeonatofifa.Repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import apicampeonatofifa.apicampeonatofifa.Modelo.Pais;

@Repository
public interface PaisRepositorio extends JpaRepository<Pais, Long>{
    
    @Query("SELECT p FROM Pais p where p.pais LIKE '%'|| ?1 || '%' ")
    List<Pais> buscar(String pais);
    
}
