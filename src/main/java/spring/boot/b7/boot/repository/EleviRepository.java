package spring.boot.b7.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import spring.boot.b7.boot.entity.Elevi;

import java.util.List;

public interface EleviRepository extends JpaRepository<Elevi, Integer> {

    List<Elevi> findByClasa_IdClasaAndIdElevGreaterThan(int idClasa, int idElev);

    @Query(value = "select * from elevi where idClasa = :idClasa and idElev > :idElev", nativeQuery = true)
    List<Elevi> oMetodaCareExecutaQuerryNativ(@Param("idClasa") int primulParametru, @Param("idElev") int alDoileaParametru);
}
