package com.geekster.Restaurant.repository;

import com.geekster.Restaurant.model.RestaurantModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class RestaurantRepository {

    static ArrayList<RestaurantModel>list=new ArrayList<>();
    public boolean allDetails(RestaurantModel details) {
         list.add(details);
         return true;
    }

    public ArrayList<RestaurantModel> getDetails() {
         return list;
    }

    public static ArrayList<RestaurantModel> alldetails() {
        return list;
    }
}
