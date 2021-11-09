package com.artemnazarov;

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Audi", "A6", 0, new Owner("Artem", "Nazarov", 26), new Date());
        System.out.println(car.getManufactureDate().toString());
        System.out.println("getSimpleName: " + car.getClass().getSimpleName());
        System.out.println("getName: " + car.getClass().getName());
        System.out.println("getPackageName: " + car.getClass().getPackageName());
        System.out.println("getTypeName: " + car.getClass().getTypeName());
        System.out.println("getCanonicalName: " + car.getClass().getCanonicalName());
        System.out.println("getDeclaredFields : " + Arrays.toString(car.getClass().getDeclaredFields()));
    }
}
