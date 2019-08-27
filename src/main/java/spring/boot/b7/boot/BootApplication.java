package spring.boot.b7.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import spring.boot.b7.boot.entity.Elevi;
import spring.boot.b7.boot.repository.EleviRepository;

import java.util.Optional;

@SpringBootApplication
public class BootApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(BootApplication.class, args);

        EleviRepository eleviRepository = context.getBean(EleviRepository.class);

        Optional<Elevi> elevul = eleviRepository.findById(8);
        System.out.println(elevul.get().getNumeElev());
        System.out.println(elevul.get().getNumeClasa());
        System.out.println(eleviRepository.findByClasa_IdClasaAndIdElevGreaterThan(2, 8).toString());
    }



}
