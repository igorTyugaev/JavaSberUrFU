package com.company.utils;

import com.company.model.Car;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Parser {
    private StringTokenizer tokenizerOuter = null;
    private String separatorsOuter = "\", {}";
    private String separatorsInner = "C_-";

    private ArrayList<String> items = new ArrayList<>();

    public Parser() {

    }

    public Parser(String inputString) {
        this.tokenizerOuter = new StringTokenizer(inputString, separatorsOuter, false);
        while (tokenizerOuter.hasMoreTokens()) {
            addItem(tokenizerOuter.nextToken());
        }
    }

    public void addItem(String str) {
        this.items.add(str);
    }

    public void setItems(ArrayList<String> items) {
        this.items = items;
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public ArrayList<Car> getCars() {
        ArrayList<Car> cars = new ArrayList<>();

        for (String item : items) {
            cars.add(getCar(item));
        }

        return cars;
    }

    public Car getCar(String str) {
        StringTokenizer tokenizerInner = new StringTokenizer(str, separatorsInner, false);
        Car car = new Car();

        if (tokenizerInner.hasMoreTokens())
            car.setCodeCar(tokenizerInner.nextToken());
        if (tokenizerInner.hasMoreTokens())
            car.setRegNumberCar(tokenizerInner.nextToken());
        if (tokenizerInner.hasMoreTokens())
            car.setMileageCar(Integer.parseInt(tokenizerInner.nextToken()));
        if (tokenizerInner.hasMoreTokens())
            car.setMoreOptionCar(Integer.parseInt(tokenizerInner.nextToken()));

        return car;
    }
}
