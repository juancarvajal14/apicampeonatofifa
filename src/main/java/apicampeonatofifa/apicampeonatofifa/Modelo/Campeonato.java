package apicampeonatofifa.apicampeonatofifa.Modelo;

import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Campeonato {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_campeonato")
    @GenericGenerator(name = "secuencia_campeonato", strategy = "increment")

    @Column(name = "id")
    private Long id;

    @Column(name = "campeonato", length = 100)
    private String campeonato;

    @ManyToOne
    @JoinColumn(name = "idpais", referencedColumnName = "id")
    private Pais pais;

    @Column(name = "año", length = 4)
    private int año;

    @Column(name = "logo")
    private String logo;


    public Campeonato() {
    }

    public Campeonato(long id, String campeonato, Pais pais, int año, String logo) {
        this.id = id;
        this.campeonato = campeonato;
        this.pais = pais;
        this.año = año;
        this.logo = logo;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(String campeonato) {
        this.campeonato = campeonato;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getLogo() {
        return campeonato;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    
}
