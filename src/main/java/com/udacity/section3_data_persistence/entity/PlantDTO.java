package com.udacity.section3_data_persistence.entity;

import java.math.BigDecimal;

public class PlantDTO{

        private String name;
        private BigDecimal price;

        /* getters and setters */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
