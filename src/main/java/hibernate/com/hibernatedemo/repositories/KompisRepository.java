package hibernate.com.hibernatedemo.repositories;

import hibernate.com.hibernatedemo.models.Kompis;
import org.springframework.data.jpa.repository.JpaRepository;



public interface KompisRepository extends JpaRepository <Kompis, Integer>{

    Kompis findByNamn(String namn);
    Kompis findByEmail(String email);
    Kompis findByPhone(String phone);

}
