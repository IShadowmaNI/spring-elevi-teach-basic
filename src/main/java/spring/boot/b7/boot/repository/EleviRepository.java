package spring.boot.b7.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import spring.boot.b7.boot.entity.Elevi;

public interface EleviRepository extends JpaRepository<Elevi, Integer> {

}
