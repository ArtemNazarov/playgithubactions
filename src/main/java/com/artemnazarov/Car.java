package com.artemnazarov;

import java.util.Date;

public class Car {

    private String brand;
    private String model;
    private int mileageKilometers;
    private Owner owner;
    private Date manufactureDate;

    public Car(String brand, String model, int mileageKilometers, Owner owner, Date manufactureDate) {
        this.brand = brand;
        this.model = model;
        this.mileageKilometers = mileageKilometers;
        this.owner = owner;
        this.manufactureDate = manufactureDate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileageKilometers() {
        return mileageKilometers;
    }

    public void setMileageKilometers(int mileageKilometers) {
        this.mileageKilometers = mileageKilometers;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }


}
