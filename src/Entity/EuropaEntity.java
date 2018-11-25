package Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "europa", schema = "rtv_db", catalog = "")
public class EuropaEntity {
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
        EuropaEntity that = (EuropaEntity) o;
        return id == that.id &&
                Double.compare(that.latitude, latitude) == 0 &&
                Double.compare(that.longitude, longitude) == 0 &&
                Objects.equals(nome, that.nome);
    }

    /**
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, nome, latitude, longitude);
    }
}
