package apicampeonatofifa.apicampeonatofifa.Modelo;

import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Ciudad {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_ciudad")
    @GenericGenerator(name = "secuencia_ciudad", strategy="increment")

    @Column(name = "id")
    private long id;

    @Column(name = "ciudad", length = 100)
    private String ciudad;

    @ManyToOne
    @JoinColumn(name = "idpais", referencedColumnName = "id")
    private Pais pais;  

    public Ciudad() {
    }

    public Ciudad(long id, String ciudad, Pais pais) {
        this.id = id;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    
    
}
