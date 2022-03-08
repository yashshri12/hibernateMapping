package com.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.model.Car;
import com.api.service.CarServiceImpl;

@RestController
@RequestMapping("/car")
public class CarController {

	@Autowired
	private CarServiceImpl carServiceImpl;

   public Car saveCar(@RequestBody Car car) {
	   return carServiceImpl.saveCar(car);
   }
}
