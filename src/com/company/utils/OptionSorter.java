package com.company.utils;

import com.company.model.Car;

import java.util.Comparator;

public class OptionSorter implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o2.getMoreOptionCar().compareTo(o1.getMoreOptionCar());
    }
}
