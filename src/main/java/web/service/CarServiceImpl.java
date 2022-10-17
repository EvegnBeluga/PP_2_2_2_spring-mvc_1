package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {
    @Autowired
    private CarDao carDao;

    @Transactional
    @Override
    public List<Car> listCars(int count) {
        return carDao.listCars(count);
    }
}
