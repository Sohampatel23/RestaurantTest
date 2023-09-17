package com.example.Restaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {

    @Autowired
    List<RestaurantModel> restaurantModels;

    @PostMapping("restaurant")
    public String addRestaurant(@RequestBody RestaurantModel restaurantModel)
    {
        restaurantModels.add(restaurantModel);
        return"Restaurant added successfully!!!";
    }

    @GetMapping("api/getall")
    public List<RestaurantModel> getAll()
    {
        return restaurantModels;
    }

    @GetMapping("api/get/id/{id}")
    public RestaurantModel getById(@PathVariable Integer id)
    {
        for(RestaurantModel restaurantModel : restaurantModels)
        {
            if(restaurantModel.getRestaurantId().equals(id))
            {
                return restaurantModel;
            }
        }
        return null;
    }

    @PutMapping("api/update/id/{id}/speciality/{speciality}")
    public String updateSpeciality(@PathVariable Integer id, @PathVariable String speciality)
    {
        for(RestaurantModel restaurantModel : restaurantModels)
        {
            if(restaurantModel.getRestaurantId().equals(id))
            {
                restaurantModel.setSpeciality(speciality);
                return "Restaurant Speciality Updated!!!";
            }
        }
        return "Invalid Id";
    }

    @DeleteMapping("api/id/{id}")
    public String deleteRestaurant(@PathVariable Integer id)
    {
        for(RestaurantModel restaurantModel : restaurantModels)
        {
            if(restaurantModel.getRestaurantId().equals(id))
            {
                restaurantModels.remove(restaurantModel);
                return "Restaurant Deleted!!!";
            }
        }
        return "Invalid Id";
    }

}
