package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Model1", 545, 2018));
        cars.add(new Car("Model2", 8451, 2015));
        cars.add(new Car("Model3", 82, 2020));
        cars.add(new Car("Model4", 543, 2019));
        cars.add(new Car("Model5", 165, 2022));
    }

    public List<Car> carList(int count){
        if (count >= 5){
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
