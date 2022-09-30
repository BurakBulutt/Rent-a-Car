package kodlama.io.carRental.controller;

import kodlama.io.carRental.business.CarManager;
import kodlama.io.carRental.entities.Car;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
@AllArgsConstructor

public class CarsController {
    private final CarManager carManager;

    @GetMapping("/gelall")
    public List<Car> getAll(){
        return carManager.getAll();
    }




}
