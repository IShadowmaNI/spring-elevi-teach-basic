package spring.boot.b7.boot.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="clasa")
public class Clasa {

    @Id
    @Column(name = "idClasa",
            unique = true,
            nullable = false)
    @GeneratedValue(
            strategy= GenerationType.AUTO,
            generator="native"
    )
    @GenericGenerator(
            name = "native",
            strategy = "native"
    )
    Integer idClasa;

    public String numeClasa;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clasa")
    List<Elevi> eleviList;

    @Override
    public String toString() {
        return "Clasa{" +
                "idClasa=" + idClasa +
                ", numeClasa='" + numeClasa + '\'' +
                '}';
    }

    public Clasa(String numeClasa) {
        this.numeClasa = numeClasa;
    }

    public Clasa() {
    }
}
