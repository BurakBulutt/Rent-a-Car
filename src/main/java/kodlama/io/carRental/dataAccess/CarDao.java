package kodlama.io.carRental.dataAccess;

import kodlama.io.carRental.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarDao extends JpaRepository<Car,Integer> {
    List<Car> getAll();
    Car findById(int id);



}
