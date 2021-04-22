package hibernate.com.hibernatedemo;

import hibernate.com.hibernatedemo.models.Kompis;
import hibernate.com.hibernatedemo.repositories.KompisRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HibernatedemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HibernatedemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(KompisRepository kompisRepository){

        return (arg) -> {
            kompisRepository.save(new Kompis("alondra", "moon 4", "alondra@a", "23566"));


            for(Kompis kompis: kompisRepository.findAll()){
                System.out.println(kompis.toString());
            }
        };

    }

}
