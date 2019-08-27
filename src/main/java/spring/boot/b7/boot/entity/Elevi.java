package spring.boot.b7.boot.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="elevi")
public class Elevi {

    @Id
    @Column(name = "idElev",
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
    Integer idElev;

    String numeElev;

    @ManyToOne
    @JoinColumn(name = "idClasa")
    Clasa clasa;

    @OneToMany(mappedBy = "elevi")
    List<Note> note;



    public Elevi() {
    }

    @Override
    public String toString() {

        return "Elevi{" +
                "idElev=" + idElev +
                ", numeElev='" + numeElev + '\'' +
                ", clasa=" + clasa +
                '}';
    }

    public Integer getIdElev() {
        return idElev;
    }

    public String getNumeElev() {
        return numeElev;
    }

    public String getNumeClasa() {
        return clasa.numeClasa;
    }
}
