package apicampeonatofifa.apicampeonatofifa.Repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import apicampeonatofifa.apicampeonatofifa.Modelo.Grupo;

@Repository
public interface GrupoRepositorio extends JpaRepository<Grupo, Long>{
    
    @Query("SELECT g FROM Grupo g where g.grupo LIKE '%'|| ?1 || '%' ")
    List<Grupo> buscar(String grupo);
    
}
