package entity;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.boot.b7.boot.entity.Elevi;

public interface Repository extends JpaRepository<Elevi, Long> {

}
