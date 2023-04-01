package apicampeonatofifa.apicampeonatofifa.Modelo;


import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_pais")
    @GenericGenerator(name = "secuencia_pais", strategy = "increment")

    @Column(name = "id")
    private Long id;

    @Column(name = "pais")
    private String pais;

    @Column(name = "entidad")
    private String entidad;

    @Column(name = "bandera")
    private String bandera;

    @Column(name = "logoentidad")
    private String logoentidad;

    // @OneToMany(mappedBy = "pais")
    // List<Grupopais> enviarPais;


    public Pais() {
    }

    public Pais(Long id, String pais, String entidad, String bandera, String logoentidad) {
        this.id = id;
        this.pais = pais;
        this.entidad = entidad;
        this.bandera = bandera;
        this.logoentidad = logoentidad;
        //this.enviarPais = enviarPais;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getBandera() {
        return bandera;
    }

    public void setBandera(String bandera) {
        this.bandera = bandera;
    }

    public String getLogoentidad() {
        return logoentidad;
    }

    public void setLogoentidad(String logoentidad) {
        this.logoentidad = logoentidad;
    }

    // public List<Grupopais> getEnviarPais() {
    //     return enviarPais;
    // }

    // public void setEnviarPais(List<Grupopais> enviarPais) {
    //     this.enviarPais = enviarPais;
    // }

    

    
}
