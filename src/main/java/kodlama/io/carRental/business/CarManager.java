package kodlama.io.carRental.business;

import kodlama.io.carRental.dataAccess.CarDao;
import kodlama.io.carRental.entities.Car;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CarManager {
    private final CarDao cardao;

    public List<Car> getAll(){
        return cardao.getAll();
    }

}
