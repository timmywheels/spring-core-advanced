package com.timwheeler.spring.standalone.collections;

import java.util.List;

public class ProductsList {

    public void setProductNames(List<String> productNames) {
        this.productNames = productNames;
    }

    List<String> productNames;

    @Override
    public String toString() {
        return "ProductsList{" +
                "productNames=" + productNames +
                '}';
    }
}
