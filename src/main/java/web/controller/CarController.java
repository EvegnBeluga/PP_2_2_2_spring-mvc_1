package web.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }
    @GetMapping("/cars")
    public String ShowId(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        List<Car> cars = carService.listCars(count);
        model.addAttribute("listCars", cars);
        return "cars";
    }
}
