package apicampeonatofifa.apicampeonatofifa.Modelo;


import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Grupo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_grupo")
    @GenericGenerator(name = "secuencia_grupo", strategy = "increment")

    @Column(name = "id")
    private Long id;

    @Column(name = "grupo")
    private String grupo;

    @ManyToOne
    @JoinColumn(name = "idcampeonato", referencedColumnName = "id")
    private Campeonato campeonato;

    /*@OneToMany(mappedBy = "grupo")
    List<Grupopais> enviarGrupo;*/


    public Grupo() {
    }

    

    public Grupo(Long id, String grupo, Campeonato campeonato) {
        this.id = id;
        this.grupo = grupo;
        this.campeonato = campeonato;
        //this.enviarGrupo = enviarGrupo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Campeonato getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }

    // public List<Grupopais> getEnviarGrupo() {
    //     return enviarGrupo;
    // }

    // public void setEnviarGrupo(List<Grupopais> enviarGrupo) {
    //     this.enviarGrupo = enviarGrupo;
    // }

    
    
}
