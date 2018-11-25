package Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "usa", schema = "rtv_db", catalog = "")
public class UsaEntity {
    private long id;
    private String nome;
    private double latitude;
    private double longitude;

    /**
     * @return
     */
    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return
     */
    @Basic
    @Column(name = "nome")
    public String getNome() {
        return nome;
    }

    /**
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return
     */
    @Basic
    @Column(name = "latitude")
    public double getLatitude() {
        return latitude;
    }

    /**
     * @param latitude
     */
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    /**
     * @return
     */
    @Basic
    @Column(name = "longitude")
    public double getLongitude() {
        return longitude;
    }

    /**
     * @param longitude
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    /**
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsaEntity usaEntity = (UsaEntity) o;
        return id == usaEntity.id &&
                Double.compare(usaEntity.latitude, latitude) == 0 &&
                Double.compare(usaEntity.longitude, longitude) == 0 &&
                Objects.equals(nome, usaEntity.nome);
    }

    /**
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, nome, latitude, longitude);
    }
}
