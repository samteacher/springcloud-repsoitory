package com.sam.themeleafdemo.bean;

import java.util.Date;

public class Product {

    private String description;
    private Integer price;
    private Date availableFrom;
    // 销售类型:促销，拼团，闪购，其它
    private String saleType;
    private String name;

    public String getSaleType() {
        return saleType;
    }

    public void setSaleType(String saleType) {
        this.saleType = saleType;
    }

    public Product(final String name, final String description, final Integer price, final Date availableFrom, final String saleType) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.availableFrom = availableFrom;
        this.saleType = saleType;
    }

    public Product(final String description, final Integer price, final Date availableFrom, final String saleType) {
        this.description = description;
        this.price = price;
        this.availableFrom = availableFrom;
        this.saleType = saleType;
    }

    public Product(final String description, final Integer price, final Date availableFrom) {
        this.description = description;
        this.price = price;
        this.availableFrom = availableFrom;
    }

    public Date getAvailableFrom() {
        return this.availableFrom;
    }

    public void setAvailableFrom(final Date availableFrom) {
        this.availableFrom = availableFrom;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return this.price;
    }

    public void setPrice(final Integer price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
