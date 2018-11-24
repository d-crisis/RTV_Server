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

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nome")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Basic
    @Column(name = "latitude")
    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    @Basic
    @Column(name = "longitude")
    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

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

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, latitude, longitude);
    }
}
