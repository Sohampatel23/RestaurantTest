package com.example.Restaurant;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class RestaurantBean {

    @Bean
    public List<RestaurantModel> getDataSource()
        {
            return new ArrayList<>();
        }
}
