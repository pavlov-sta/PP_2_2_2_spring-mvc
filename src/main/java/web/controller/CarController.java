package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;


@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(name = "count", defaultValue = "10" ) int carCount, ModelMap model) {
        List<Car> carList = new CarService().getCar(carCount);
        model.addAttribute("message", "Car list");
        model.addAttribute("cars", carList);
        return "cars";
    }
}
