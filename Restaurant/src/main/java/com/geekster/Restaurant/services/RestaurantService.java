package com.geekster.Restaurant.services;

import com.geekster.Restaurant.model.RestaurantModel;
import com.geekster.Restaurant.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RestaurantService {
    @Autowired
    RestaurantRepository restaurantRepository;

    public String addRestaurantDetails(RestaurantModel details) {
        boolean status=restaurantRepository.allDetails(details);
        if(status){
            return "Restaurant Details added";
        }
        else{
            return "Restaurant Details Not added";
        }
    }

    public ArrayList<RestaurantModel> getRestaurantDetails() {
     return restaurantRepository.alldetails();
    }

    public RestaurantModel getObjById(int id) {
        ArrayList<RestaurantModel>allList=RestaurantRepository.alldetails();
           RestaurantModel objects=null;
          for(RestaurantModel objList:allList){
              if(objList.getId()==id){
                 objects=objList;
                 break ;
              }
          }
          return objects;
    }

    public String updateSpecialty(int id, String specialty) {
        ArrayList<RestaurantModel>allList=RestaurantRepository.alldetails();
        for(RestaurantModel objList:allList){
            if(objList.getId()==id){
                objList.setSpecialty(specialty);
                return "specialty updated";
            }
        }
        return "specialty not updated";
    }

    public String deleteRestaurant(int id) {
  ArrayList<RestaurantModel>allList=RestaurantRepository.alldetails();
  for(RestaurantModel objList:allList){
      if(objList.getId()==id){
          allList.remove(objList);
          return "restaurant id deleted";
         }
       }
        return "restaurant id not deleted";
    }
}
