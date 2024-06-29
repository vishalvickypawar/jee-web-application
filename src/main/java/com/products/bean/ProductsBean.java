package com.products.bean;

import com.products.entity.Product;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named("ProductsBean")
@RequestScoped
public class ProductsBean implements Serializable {
    private String repoName;
    private Product product;
    public List<Product> getProducts(){
        ArrayList<Product> products = new ArrayList<>();
    }
}
