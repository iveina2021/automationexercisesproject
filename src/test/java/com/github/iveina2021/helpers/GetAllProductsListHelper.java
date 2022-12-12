package com.github.iveina2021.helpers;

public class GetAllProductsListHelper {
    private String id;
    private String name;
    private String price;
    private String brand;
    private String category;

    public void ProductsList(String id, String name, String price, String brand, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.category = category;
    }

    //get/set

    // List<GetAllProductsListHelper> AllProductsList = new List<GetAllProductsListHelper>();
}
