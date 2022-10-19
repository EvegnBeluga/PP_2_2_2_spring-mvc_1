package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private static final List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("Mercedes", "X389", 2016));
        cars.add(new Car("BMW", "X128", 1996));
        cars.add(new Car("Toyota", "J888", 2006));
        cars.add(new Car("Niva", "X389", 1985));
        cars.add(new Car("Lada", "J582", 2021));
    }

    @Override
    public List<Car> listCars(int count) {
        if (count > 0 && count < 5) {

            return cars.stream().limit(count).toList();
        } else {
            return cars;
        }
    }
}