package apicampeonatofifa.apicampeonatofifa.Modelo;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Fase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_fase")
    @GenericGenerator(name = "secuencia_fase", strategy = "increment")

    @Column(name = "id")
    private Long id;

    @Column(name = "fase")
    private String fase;
 

    public Fase() {
    }

    public Fase(Long id, String fase) {
        this.id = id;
        this.fase = fase;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }
   
}
