package apicampeonatofifa.apicampeonatofifa.Modelo;

import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Estadio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_estadio")
    @GenericGenerator(name = "secuencia_estadio", strategy = "increment")

    @Column(name = "id")
    private Long id;

    @Column(name = "estadio")
    private String estadio;

    @ManyToOne
    @JoinColumn(name = "idciudad", referencedColumnName = "id")
    private Ciudad ciudad;

    @Column(name = "capacidad")
    private int capacidad;

    @Column(name = "foto")
    private String foto;

    
    public Estadio() {
    }

    public Estadio(Long id, String estadio, Ciudad ciudad, int capacidad, String foto) {
        this.id = id;
        this.estadio = estadio;
        this.ciudad = ciudad;
        this.capacidad = capacidad;
        this.foto = foto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

}
