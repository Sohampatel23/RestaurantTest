package com.example.Restaurant;

public class RestaurantModel {

    private Integer restaurantId;
    private String restaurantName;
    private String speciality;
    private String address;
    private Integer phoneNumber;
    private Integer staff;
    private Integer rating;

    public RestaurantModel(Integer restaurantId, String restaurantName, String speciality, String address, Integer phoneNumber, Integer staff, Integer rating) {
        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
        this.speciality = speciality;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.staff = staff;
        this.rating = rating;
    }

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getStaff() {
        return staff;
    }

    public void setStaff(Integer staff) {
        this.staff = staff;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
