package com.company.model;

import com.company.utils.Constants;
import com.company.utils.MileageSorter;
import com.company.utils.OptionSorter;

import java.util.ArrayList;

import static com.company.utils.Constants.CODE_CARS;

public class GSM {
    private ArrayList<Car> cars = new ArrayList<>();

    public GSM() {
    }

    public GSM(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public double getTotalCoast() {
        double totalCoast = 0.0d;

        for (Car car : cars) {
            double costPerLiter = Constants.COST_PER_LITER.getOrDefault(car.getCodeCar(), 0.00d);
            float consumption = Constants.CONSUMPTION.getOrDefault(car.getCodeCar(), 0.0f);
            float mileage = (float) ((float) car.getMileageCar() / 100.0);
            totalCoast += ((double) costPerLiter * consumption * mileage);
        }

        return totalCoast;
    }

    public double getTotalCoastByType(String typeCar) {
        double totalCoast = 0.0d;

        for (Car car : cars) {
            if (typeCar.equals(car.getCodeCar())) {
                double costPerLiter = Constants.COST_PER_LITER.getOrDefault(car.getCodeCar(), 0.00d);
                float consumption = Constants.CONSUMPTION.getOrDefault(car.getCodeCar(), 0.0f);
                float mileage = (float) ((float) car.getMileageCar() / 100.0);
                totalCoast += ((double) costPerLiter * consumption * mileage);
            }
        }

        return totalCoast;
    }

    public String getTypeCarByMaxTotalCoast() {
        String typeCar = new String();
        double max = Double.NEGATIVE_INFINITY;

        for (String type : CODE_CARS.keySet()) {
            double maxLocal = getTotalCoastByType(type);
            if (maxLocal >= max) {
                max = maxLocal;
                typeCar = type;
            }
        }

        return typeCar;
    }

    public String getTypeCarByMinTotalCoast() {
        String typeCar = new String();
        double min = Double.POSITIVE_INFINITY;

        for (String type : CODE_CARS.keySet()) {
            double minLocal = getTotalCoastByType(type);
            if (minLocal <= min) {
                min = minLocal;
                typeCar = type;
            }
        }

        return typeCar;
    }

    public void printAboutCarWithSort() {
//        cars.sort(new MileageSorter());
        cars.sort(new OptionSorter());

        System.out.println("\n");
        for (Car car : cars) {
            System.out.println("Тип: " + CODE_CARS.getOrDefault(car.getCodeCar(), "unknown type"));
            System.out.println("Номер: " + car.getRegNumberCar());
            System.out.println("Пробег: " + car.getMileageCar());
            System.out.println("Доп. параметр: " + car.getMoreOptionCar());
            System.out.println("\n");
        }
    }
}
