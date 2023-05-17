package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    private final List<Car> carList = new ArrayList<>();

    public List<Car> getCar(int count) {
        carList.add(new Car("BMW", 546));
        carList.add(new Car("Lada", 1233));
        carList.add(new Car("Honda", 2));
        carList.add(new Car("Volvo", 50));
        carList.add(new Car("Mazda", 3));
        return count == 0 || count > 5 ? carList : carList.stream().limit(count).toList();
    }
}
