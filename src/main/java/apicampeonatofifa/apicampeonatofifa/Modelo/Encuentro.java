package apicampeonatofifa.apicampeonatofifa.Modelo;

import java.sql.Date;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Encuentro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_encuentro")
    @GenericGenerator(name = "secuencia_encuentro", strategy = "increment")

    @Column(name = "id", unique = true)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idpais1", referencedColumnName = "id")
    private Pais pais1;

    @ManyToOne
    @JoinColumn(name = "idpais2", referencedColumnName = "id")
    private Pais pais2;

    @ManyToOne
    @JoinColumn(name = "idfase", referencedColumnName = "id")
    private Fase fase;

    @ManyToOne
    @JoinColumn(name = "idcampeonato", referencedColumnName = "id")
    private Campeonato campeonato;

    @ManyToOne
    @JoinColumn(name = "idestadio", referencedColumnName = "id")
    private Estadio estadio;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "goles1")
    private int goles1;

    @Column(name = "goles2")
    private int goles2;

    @Column(name = "penales1")
    private int penales1;

    @Column(name = "penales2")
    private int penales2;

    @Column(name = "ecuentro")
    private String encuentro;

    

    public Encuentro() {
    }

    public Encuentro(Long id, Pais pais1, Pais pais2, Fase fase, Campeonato campeonato, Estadio estadio, Date fecha,
            int goles1, int goles2, int penales1, int penales2, String encuentro) {
        this.id = id;
        this.pais1 = pais1;
        this.pais2 = pais2;
        this.fase = fase;
        this.campeonato = campeonato;
        this.estadio = estadio;
        this.fecha = fecha;
        this.goles1 = goles1;
        this.goles2 = goles2;
        this.penales1 = penales1;
        this.penales2 = penales2;
        this.encuentro = encuentro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pais getPais1() {
        return pais1;
    }

    public void setPais1(Pais pais1) {
        this.pais1 = pais1;
    }

    public Pais getPais2() {
        return pais2;
    }

    public void setPais2(Pais pais2) {
        this.pais2 = pais2;
    }

    public Fase getFase() {
        return fase;
    }

    public void setFase(Fase fase) {
        this.fase = fase;
    }

    public Campeonato getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getGoles1() {
        return goles1;
    }

    public void setGoles1(int goles1) {
        this.goles1 = goles1;
    }

    public int getGoles2() {
        return goles2;
    }

    public void setGoles2(int goles2) {
        this.goles2 = goles2;
    }

    public int getPenales1() {
        return penales1;
    }

    public void setPenales1(int penales1) {
        this.penales1 = penales1;
    }

    public int getPenales2() {
        return penales2;
    }

    public void setPenales2(int penales2) {
        this.penales2 = penales2;
    }

    public String getEncuentro() {
        return encuentro;
    }

    public void setEncuentro(String encuentro) {
        this.encuentro = encuentro;
    }
    
    
}
