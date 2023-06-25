package com.geekster.Restaurant.controllers;

import com.geekster.Restaurant.model.RestaurantModel;
import com.geekster.Restaurant.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;

    @PostMapping("/post")
    public String addRestaurant(@RequestBody RestaurantModel details){
     return restaurantService.addRestaurantDetails(details);
    }
    @GetMapping("/get")
    public ArrayList<RestaurantModel>getDetails(){
    return restaurantService.getRestaurantDetails();
    }
    @GetMapping("/getId/{id}")
    public RestaurantModel getObjById(@PathVariable int id){
       return restaurantService.getObjById(id);
    }
    @PutMapping("/update/{id}/{specialty}")
    public String updateSpecialty(@PathVariable int id, @PathVariable String specialty){
        return restaurantService.updateSpecialty(id,specialty);
    }
    @DeleteMapping("delete/{id}")

    public String deleteRestaurant(@PathVariable int id){
        return restaurantService.deleteRestaurant(id);
    }
}
